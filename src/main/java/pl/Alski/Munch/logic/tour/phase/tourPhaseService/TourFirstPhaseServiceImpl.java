package pl.Alski.Munch.logic.tour.phase.tourPhaseService;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.doorCard.curse.Curse;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.cards.doorCard.monster.Monster;
import pl.Alski.Munch.logic.fight.service.FightServiceFacade;
import pl.Alski.Munch.logic.cards.service.CardServiceFacade;
import pl.Alski.Munch.logic.cards.service.service.CardDealService;
import pl.Alski.Munch.logic.moves.service.PlayerPossibleMovesService;
import pl.Alski.Munch.logic.tour.Tour;
import pl.Alski.Munch.logic.tour.phase.TourPhase;
import pl.Alski.Munch.logic.tour.TourStatus;
import pl.Alski.Munch.logic.player.Player;
import pl.Alski.Munch.logic.cards.service.service.CardUseService;
import pl.Alski.Munch.logic.moves.PlayerMove;
import pl.Alski.Munch.logic.events.service.EventService;
import pl.Alski.Munch.logic.player.service.PlayerCommunicationService;

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


    public Tour playFirstPhase(Tour tour, Game game) {
        Player player = tour.getPlayer();
        tour.setPhase(TourPhase.OPEN_THE_DOOR);
        tour.setStatus(TourStatus.STARTED);

        playerMoveService.setPlayerMoves(tour.getSpectators(), List.of(PlayerMove.DO_NOTHING));
        List<Player> spectators = tour.getSpectators();
        DoorCard currentDoorCard = cardService.dealNextDoorCardOnTable(game);

        if (currentDoorCard instanceof Monster) {
            logger.info(player.getName() + " is about to start a fight with " + currentDoorCard.toString() + ".");
            fightServiceFacade.fight(player, (Monster) currentDoorCard, game);
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
