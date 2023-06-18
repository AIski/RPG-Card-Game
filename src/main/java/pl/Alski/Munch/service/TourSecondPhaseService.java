package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.tour.Tour;
import pl.Alski.Munch.tour.TourPhase;
import pl.Alski.Munch.tour.TourStatus;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TourSecondPhaseService {


    public Tour playSecondPhase(Tour tour){
        Player currentPlayer = tour.getPlayer();
        tour.setPhase(TourPhase.ASK_FOR_TROUBLE);
        tour.setStatus(TourStatus.STARTED);
        List<Card> monsterList = tour.getPlayer().getHand().stream()
                .filter(a -> a instanceof Monster)
                .collect(Collectors.toList());
        // if player wants, he can fight one of his monsters
        //TODO: this code. need to send request to player, get response, proceed with fight if necessary
        boolean playerResponse = playerCommunicationService.askPlayer("Do Ask For Trouble? (Do you want to fight any of the monsters from your hand?)");
        if (playerResponse) {
            playerCommunicationService.askPlayer("Which monster do you want to fight? ", monsterList);
            // if player picks a monster, set the fight,
            // else return
            tour.setPhase;
        }
        logger.info(currentPlayer.getName() + " ended his second Tour Phase.");

        tour.setStatus(TourStatus.FINISHED);
        return tour;
    }
}
