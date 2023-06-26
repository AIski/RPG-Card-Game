package pl.Alski.Munch.tour.tourPhaseService;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.Curse;
import pl.Alski.Munch.cards.doorCards.DoorCard;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.fight.Fight;
import pl.Alski.Munch.fight.service.FightServiceFacade;
import pl.Alski.Munch.cards.service.CardServiceFacade;
import pl.Alski.Munch.cards.service.CardDealService;
import pl.Alski.Munch.fight.service.PlayerPossibleMovesService;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.cards.service.CardUseService;
import pl.Alski.Munch.player.moves.PlayerMove;
import pl.Alski.Munch.service.EventService;
import pl.Alski.Munch.service.PlayerCommunicationService;
import pl.Alski.Munch.tour.Tour;
import pl.Alski.Munch.tour.TourStatus;
import pl.Alski.Munch.tour.TourPhase;

import java.util.List;

@Service
@AllArgsConstructor
public class TourFirstPhaseServiceImpl implements TourFirstPhaseService{

    private final static Logger logger = LoggerFactory.getLogger(TourFirstPhaseServiceImpl.class);
    private CardServiceFacade cardService;
    private CardDealService cardDealService;
    private FightServiceFacade fightServiceFacade;
    private EventService eventService;
    private PlayerCommunicationService communicationService;
    private CardUseService cardUseService;
    private PlayerPossibleMovesService playerMoveService;


    public Tour playFirstPhase(Tour tour) {
        Player player = tour.getPlayer();
        tour.setPhase(TourPhase.OPEN_THE_DOOR);
        tour.setStatus(TourStatus.STARTED);

        playerMoveService.setPlayerMoves(tour.getSpectators(), List.of(PlayerMove.DO_NOTHING));
        List<Player> spectators = tour.getSpectators();
        DoorCard currentDoorCard = cardService.dealNextDoorCardOnTable();

        if (currentDoorCard instanceof Monster) {
            logger.info(player.getName() + " is about to start a fight with " + currentDoorCard.toString() + ".");
            fightServiceFacade.fight(player, (Monster) currentDoorCard, spectators);
            tour.setFoughtAMonster(true);
        } else if (currentDoorCard instanceof Curse) {
            doCurseLogic(player, currentDoorCard);
            tour.setFoughtAMonster(false);
        } else {
            cardDealService.dealCardToPlayer(currentDoorCard, player);
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
            cardDealService.dealCardToPlayer(currentDoorCard, currentPlayer);
        }
    }

    private void checkPlayerWantsToUseThisCardNow(Player player, DoorCard card) {
        playerMoveService.setPlayerMoves(player, List.of(PlayerMove.ANSWER_QUESTION));
        boolean confirmation = communicationService.askPlayer(player, "Do you want to use extra card right away? " + card.toString() + ".");
        if (confirmation) {
            cardUseService.useCard(player, card);
        }
    }


}
