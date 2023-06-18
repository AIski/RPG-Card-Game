package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.tour.Tour;
import pl.Alski.Munch.tour.TourStatus;

@Service
public class TourFourthPhaseService {


    public Tour playFourthPhase(Tour tour){
        // If you got too many items on your hand, play these you want at this point.
        // else you must give away the cards over the hand limit to player with lowest level.
        // if there are players with same, lowest level, you split the cards, as fair as possible.
        // if you are the lowest level, throw away extra cards.
        boolean playerHasTooManyCards = !handValidatorService.validateHand(tour.getPlayer())
        while (playerHasTooManyCards) {
            playerCommunicationService.askPlayer("You have too many cards on your hand." +
                    , monsterList);


        }

        logger.info(currentPlayer.getName() + " ended his fourth Tour Phase.");
        tour.setStatus(TourStatus.FINISHED);
        return tour;
    }

}
