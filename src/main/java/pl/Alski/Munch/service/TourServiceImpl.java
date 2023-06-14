package pl.Alski.Munch.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Player;
import pl.Alski.Munch.tour.Tour;
import pl.Alski.Munch.tour.TourPhase;

@Service
@AllArgsConstructor
public class TourServiceImpl implements TourService{
    private final static Logger logger = LoggerFactory.getLogger(TourServiceImpl.class);
    private TourPhaseService tourService;


    @Override
    public void startPlayerTour(Player player) {
        Tour tour = new Tour(player, null, false);
        logger.info(player.getName() + " is starting his tour.");
        tourService.startFirstPhase(tour);
        //TODO: THIS, TOUR LOGIC
    }
}
