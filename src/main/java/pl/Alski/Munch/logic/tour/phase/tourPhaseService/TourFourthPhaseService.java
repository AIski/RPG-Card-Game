package pl.Alski.Munch.logic.tour.phase.tourPhaseService;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.tour.Tour;

@Service
public interface TourFourthPhaseService {
    Tour playFourthPhase(Tour tour, Game game);
}
