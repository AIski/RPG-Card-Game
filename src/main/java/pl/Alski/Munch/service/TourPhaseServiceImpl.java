package pl.Alski.Munch.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.Curse;
import pl.Alski.Munch.cards.doorCards.DoorCard;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.cards.doorCards.fight.Fight;
import pl.Alski.Munch.cards.doorCards.fight.FightService;
import pl.Alski.Munch.cards.doorCards.fight.escape.FightEscapeService;
import pl.Alski.Munch.cards.service.CardServiceFacade;
import pl.Alski.Munch.entity.Player;
import pl.Alski.Munch.tour.Tour;
import pl.Alski.Munch.tour.TourPhase;

@Service
@AllArgsConstructor
public class TourPhaseServiceImpl implements TourPhaseService{

    private CardServiceFacade cardService;
    private FightService fightService;
    private CharacterLevelPromotionService promotionService;
    private final static Logger logger = LoggerFactory.getLogger(TourPhaseServiceImpl.class);
    private ConditionService conditionService;
    private FightEscapeService escapeService;


    @Override
    public void startFirstPhase(Tour tour) {
        tour.setPhase(TourPhase.ASK_FOR_TROUBLE);
        DoorCard currentDoorCard = cardService.dealNextDoorCardOnTable();
        logger.info(tour.getPlayer().getName()+ " rolled + " + currentDoorCard.toString());
        Player currentPlayer = tour.getPlayer();
        if (currentDoorCard instanceof Monster) {
            Fight fight = fightService.startFight(currentPlayer, (Monster) currentDoorCard);
            if (fight.isWon()) {
                //check player is eligible for promotion
                // if so, promote him
                //check player is eligible for loot, if so, call the loot

                // TODO

                cardService.discardCard(currentDoorCard);
            }
            else{
                boolean escapeResult = escapeService.tryToEscapeFromAllMonsters(currentPlayer, fight);
                if (escapeResult){
                    cardService.discardCard(currentDoorCard);
                }
                //            // if you escape, you dont get loot or level
                //            // if you fail to escape, you face the monster miserable end.
            }
            tour.setFoughtAMonster(true);
        }
        if (currentDoorCard instanceof Curse){

            // TODO this.
        }

    }

    @Override
    public void startSecondPhase(Tour tour) {

    }

    @Override
    public void startThirdPhase(Tour tour) {

    }

    @Override
    public void startFourthPhase( Tour tour) {

    }


}
