package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.Curse;
import pl.Alski.Munch.cards.doorCards.DoorCard;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.cards.doorCards.fight.Fight;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.tour.Tour;
import pl.Alski.Munch.tour.TourPhase;
import pl.Alski.Munch.tour.TourStatus;

@Service
public class TourFirstPhaseService {

    public Tour playFirstPhase(Tour tour) {
        Player currentPlayer = tour.getPlayer();
        tour.setPhase(TourPhase.OPEN_THE_DOOR);
        tour.setStatus(TourStatus.STARTED);

        DoorCard currentDoorCard = cardService.dealNextDoorCardOnTable();

        if (currentDoorCard instanceof Monster) {
            doMonsterLogic(currentPlayer, (Monster) currentDoorCard);
            tour.setFoughtAMonster(true);
        } else if (currentDoorCard instanceof Curse) {
            doCurseLogic(currentPlayer, currentDoorCard);
            tour.setFoughtAMonster(false);
        } else {
            dealCardService.dealCardToPlayer(currentDoorCard, currentPlayer);
        }
        logger.info(currentPlayer.getName() + " ended his first Tour Phase.");
        tour.setStatus(TourStatus.FINISHED);
        return tour;
    }

    private void doMonsterLogic (Player currentPlayer, Monster monster){
        Fight fight = fightService.startFight(currentPlayer, monster);
        if (fight.isWon()) {
            //check player is eligible for promotion
            // if so, promote him
            //check player is eligible for loot, if so, call the loot

            // TODO

            cardService.discardCard(monster);
        } else {
            boolean escapeResult = escapeService.tryToEscapeFromAllMonsters(currentPlayer, fight);
            if (escapeResult) {
                cardService.discardCard(monster);
            }
            //            // if you escape, you dont get loot or level
            //            // if you fail to escape, you face the monster miserable end.
        }

    }

    private void doCurseLogic (Player currentPlayer, DoorCard currentDoorCard){
        if (((Curse) currentDoorCard).isAutoCast()) {
            eventService.makeEventHappenToPlayer(((Curse) currentDoorCard).getEvent(), currentPlayer);
        } else {
            dealCardService.dealCardToPlayer(currentDoorCard, currentPlayer);
        }
    }

}
