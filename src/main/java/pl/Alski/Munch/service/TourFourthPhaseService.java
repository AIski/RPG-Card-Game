package pl.Alski.Munch.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.service.DealCardService;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.tour.Tour;
import pl.Alski.Munch.tour.TourPhase;
import pl.Alski.Munch.tour.TourStatus;

@Service
@AllArgsConstructor
public class TourFourthPhaseService {

    private final static Logger logger = LoggerFactory.getLogger(TourPhaseServiceImpl.class);
    private HandValidatorService handValidatorService;
    private PlayerCommunicationService communicationService;
    private DealCardService dealCardService;


    // If you got too many items on your hand, play these you want at this point.
    // else you must give away the cards over the hand limit to player with lowest level.
    // if there are players with same, lowest level, you split the cards, as fair as possible.
    // if you are the lowest level, throw away extra cards.

    public Tour playFourthPhase(Tour tour){
        Player player = tour.getPlayer();
        tour.setPhase(TourPhase.SHOW_MERCY);
        tour.setStatus(TourStatus.STARTED);

        boolean playerHasTooManyCards = !handValidatorService.validateHand(tour.getPlayer());
        while (playerHasTooManyCards) {
            //TODO for later: players with lowest level should get the cards, as fair as possible
            // if player is lowest level, cards should be discarded.
           Card cardToBeGivenAway = communicationService.askPlayerWhichCard(player.getId(), player.getHand(), "Which card do you want to give away?");
           Player playerToGiveCardTo = communicationService.AskWhichPlayer(cardToBeGivenAway, "Who do you want to give the card to?");
           logger.info(player.getName() + " decided to give away card " + cardToBeGivenAway +" to " + playerToGiveCardTo.getName());
           dealCardService.dealCardToPlayer(cardToBeGivenAway, playerToGiveCardTo);
        }
        logger.info(player.getName() + "has correct number of cards and ended his fourth Tour Phase.");
        tour.setStatus(TourStatus.FINISHED);
        return tour;
    }

}
