package pl.Alski.Munch.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.tour.Tour;

@Service
@AllArgsConstructor
public class TourServiceImpl implements TourService{
    private final static Logger logger = LoggerFactory.getLogger(TourServiceImpl.class);
    private TourPhaseService tourService;
    private HandValidatorService handService;


    @Override
    public void startPlayerTour(Player player) {
        Tour tour = new Tour(player, null, false);
        logger.info(player.getName() + " is starting his tour.");
        tourService.startFirstPhase(tour);
        //TODO: THIS, TOUR LOGIC + need to separate the tours, with some logic
        if (!tour.isFoughtAMonster()){
            //if player has a monster card in his hand, he can fight it
            logger.info(player.getName() + "  can now start 2nd phase- Ask for trouble.");
            tourService.startSecondPhase(tour);
        }
        if (!tour.isFoughtAMonster()){
            logger.info(player.getName() + " didn't fight a monster in this tour yet. He can Search the room.");
            tourService.startThirdPhase(tour);
        }
        if (!handService.validateHand(player)){
            tourService.startFourthPhase(tour);
        }

    }
}
