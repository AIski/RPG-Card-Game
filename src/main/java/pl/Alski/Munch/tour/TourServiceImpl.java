package pl.Alski.Munch.tour;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.service.HandValidatorService;
import pl.Alski.Munch.service.PlayerCommunicationService;
import pl.Alski.Munch.tour.tourPhaseService.TourPhaseService;

import java.util.List;

@Service
@AllArgsConstructor
public class TourServiceImpl implements TourService {
    private final static Logger logger = LoggerFactory.getLogger(TourServiceImpl.class);
    private TourPhaseService tourService;
    private HandValidatorService handService;
    private PlayerCommunicationService communicationService;


    @Override
    public Tour playPlayerTour(Player player, List<Player> spectators) {
        Tour tour = new Tour(
                player,
                null,
                null,
                false,
                spectators);
        logger.info(player.getName() + " is starting his tour.");
        tour = tourService.playFirstPhase(tour);

        if (canPlaySecondPhase(tour) & checkPlayerReadyForNextRound(player)) {
            logger.info(player.getName() + "  can now start 2nd phase- Ask for trouble.");
            tour = tourService.playSecondPhase(tour);
        } else logger.info(player.getName() + "  cannot play 2nd phase- Ask for trouble.");

        if (canPlayThirdPhase(tour) & checkPlayerReadyForNextRound(player)) {
            logger.info(player.getName() + " didn't fight a monster in this tour yet. He can Search the room.");
            tourService.playThirdPhase(tour);
        } else logger.info(player.getName() + "  cannot play 3rd phase- Search the Room.");
        if (haveToPlayFourthPhase(tour) & checkPlayerReadyForNextRound(player)) {
            tourService.playFourthPhase(tour);
        }
        logger.info(player.getName() + " finished his tour.");
        return tour;
    }


    private static boolean canPlaySecondPhase(Tour tour) {
        return !tour.isFoughtAMonster() &&
                (tour.getStatus() == TourStatus.FINISHED) &&
                (tour.getPhase() == TourPhase.OPEN_THE_DOOR);
    }

    private static boolean canPlayThirdPhase(Tour tour) {
        return !tour.isFoughtAMonster() &&
                (tour.getStatus() == TourStatus.FINISHED) &&
                ((tour.getPhase() == TourPhase.OPEN_THE_DOOR)
                        || (tour.getPhase() == TourPhase.ASK_FOR_TROUBLE));
    }

    private boolean haveToPlayFourthPhase(Tour tour) {
        return (tour.getStatus() == TourStatus.FINISHED) && !handService.validateHand(tour.getPlayer());
    }

    private boolean checkPlayerReadyForNextRound(Player player) {
        return communicationService.askPlayer(player, "Are you yeady for next phase?");
    }
}
