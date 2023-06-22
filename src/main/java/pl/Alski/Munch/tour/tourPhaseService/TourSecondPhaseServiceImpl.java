package pl.Alski.Munch.tour.tourPhaseService;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.fight.Fight;
import pl.Alski.Munch.fight.service.FightServiceFacade;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.player.moves.PlayerMove;
import pl.Alski.Munch.service.PlayerCommunicationService;
import pl.Alski.Munch.tour.Tour;
import pl.Alski.Munch.tour.TourStatus;
import pl.Alski.Munch.tour.TourPhase;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TourSecondPhaseServiceImpl implements TourSecondPhaseService{

    private final static Logger logger = LoggerFactory.getLogger(TourSecondPhaseServiceImpl.class);
    private PlayerCommunicationService communicationService;
    private FightServiceFacade fightServiceFacade;


    public Tour playSecondPhase(Tour tour) {
        Player player = tour.getPlayer();
        tour.setPhase(TourPhase.ASK_FOR_TROUBLE);
        tour.setStatus(TourStatus.STARTED);
        List<Card> monsters = tour.getPlayer().getHand().stream()
                .filter(a -> a instanceof Monster)
                .collect(Collectors.toList());
        return !monsters.isEmpty() ? possibleFightScenario(tour, player, monsters) : noFightScenario(tour);
    }

    private Tour possibleFightScenario(Tour tour, Player player, List<Card> monsters) {
         if (checkPlayerWantsToFight(player)) {
             player.setPlayerMoves(List.of(PlayerMove.PICK_MONSTER_CARD));
             Monster monster = (Monster) communicationService.askPlayerWhichCard(
                     player.getId(), monsters, "Which monster do you want to fight with?");
             logger.info(player.getName() + " picked a monster to fight with: " + monster.toString());
             fightServiceFacade.fight(player, monster);
             tour.setFoughtAMonster(true);
         }
         else{
             return noFightScenario(tour);
         }

        logger.info(player.getName() + " ended his second Tour Phase.");
        tour.setStatus(TourStatus.FINISHED);
        return tour;
    }

    private boolean checkPlayerWantsToFight(Player player) {
        player.setPlayerMoves(List.of(PlayerMove.ANSWER_QUESTION));
        return communicationService.askPlayer(player,
                "You can now Ask for Trouble and pick a Monster to fight with, from your Hand. Do you want it?");
    }

    private static Tour noFightScenario(Tour tour) {
        logger.info(tour.getPlayer().getName() +
                " ended his second Tour Phase without a fight.");
        tour.setStatus(TourStatus.FINISHED);
        return tour;
    }

}


