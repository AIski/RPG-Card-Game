package pl.Alski.Munch.tour.tourPhaseService;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.moves.PlayerMove;
import pl.Alski.Munch.service.HandValidatorService;
import pl.Alski.Munch.tour.Tour;
import pl.Alski.Munch.tour.TourPhase;
import pl.Alski.Munch.tour.TourStatus;

import java.util.List;


@Service
@AllArgsConstructor
public class TourFourthPhaseServiceImpl implements TourFourthPhaseService{

    private final static Logger logger = LoggerFactory.getLogger(TourPhaseServiceImpl.class);
    private HandValidatorService handValidatorService;
    private TourSaveService saveService;

    // If you got too many items on your hand, play these you want at this point.
    // else you must give away the cards over the hand limit to player with lowest level.
    // if there are players with same, lowest level, you split the cards, as fair as possible.
    // if you are the lowest level, throw away extra cards.

    //TODO for later: players with lowest level should get the cards, as fair as possible
    // if player is lowest level, cards should be discarded.

    public Tour playFourthPhase(Tour tour){
        Player player = tour.getPlayer();
        tour.setPhase(TourPhase.SHOW_MERCY);
        tour.setStatus(TourStatus.STARTED);

        logger.info(player.getName() + " has started his fourth Tour Phase.");

        boolean playerHasTooManyCards = !handValidatorService.validateHand(tour.getPlayer());
        while (playerHasTooManyCards) {
           logger.info(player.getName() + " has too many cards. He has to give some away.");
            player.setPlayerMoves(List.of(PlayerMove.GIVE_CARD_AWAY));
            saveService.save(tour);
        }

        logger.info(player.getName() + "has correct number of cards and ended his fourth Tour Phase.");

        tour.setStatus(TourStatus.FINISHED);
        saveService.save(tour);
        return tour;
    }

}
