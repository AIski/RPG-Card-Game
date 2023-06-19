package pl.Alski.Munch.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.doorCards.Curse;
import pl.Alski.Munch.cards.doorCards.DoorCard;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.cards.doorCards.fight.Fight;
import pl.Alski.Munch.cards.doorCards.fight.FightService;
import pl.Alski.Munch.cards.service.CardServiceFacade;
import pl.Alski.Munch.cards.service.DealCardService;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.tour.Tour;
import pl.Alski.Munch.tour.TourPhase;
import pl.Alski.Munch.tour.TourStatus;

@Service
@AllArgsConstructor
public class TourFirstPhaseService {

    private final static Logger logger = LoggerFactory.getLogger(TourFirstPhaseService.class);
    private CardServiceFacade cardService;
    private DealCardService dealCardService;
    private FightService fightService;
    private EventService eventService;
    private PlayerCommunicationService communicationService;
    private CardUseService cardUseService;


    public Tour playFirstPhase(Tour tour) {
        Player player = tour.getPlayer();
        tour.setPhase(TourPhase.OPEN_THE_DOOR);
        tour.setStatus(TourStatus.STARTED);

        DoorCard currentDoorCard = cardService.dealNextDoorCardOnTable();

        if (currentDoorCard instanceof Monster) {
            logger.info(player.getName() + " is about to start a fight with " + currentDoorCard.toString() + ".");
            Fight fight = fightService.startFight(player, (Monster) currentDoorCard);
            tour.setFoughtAMonster(true);
        } else if (currentDoorCard instanceof Curse) {
            doCurseLogic(player, currentDoorCard);
            tour.setFoughtAMonster(false);
        } else {
            dealCardService.dealCardToPlayer(currentDoorCard, player);
            checkPlayerWantsToUseThisCardNow(player, currentDoorCard);
        }
        logger.info(player.getName() + " ended his first Tour Phase.");
        tour.setStatus(TourStatus.FINISHED);
        return tour;
    }


    private void doCurseLogic(Player currentPlayer, DoorCard currentDoorCard) {
        if (((Curse) currentDoorCard).isAutoCast()) {
            eventService.makeEventHappenToPlayer(((Curse) currentDoorCard).getEvent(), currentPlayer);
        } else {
            dealCardService.dealCardToPlayer(currentDoorCard, currentPlayer);
        }
    }

    private void checkPlayerWantsToUseThisCardNow(Player player, DoorCard card) {
        boolean confirmation = communicationService.askPlayer(player, "Do you want to use extra card right away? " + card.toString() + ".");
        if (confirmation) {
            cardUseService.useCard(player, card);
        }
    }


}
