package pl.Alski.Munch.logic.tour.phase.tourPhaseService;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.tour.Tour;

@Service
public interface TourPhaseService {

    public Tour playFirstPhase(Tour player, Game game);

    public Tour playSecondPhase(Tour tour, Game game);

    public Tour playThirdPhase(Tour tour, Game game);

    public Tour playFourthPhase(Tour tour, Game game);

}

