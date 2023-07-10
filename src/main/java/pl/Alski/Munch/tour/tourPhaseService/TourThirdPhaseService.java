package pl.Alski.Munch.tour.tourPhaseService;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.tour.Tour;

@Service
public interface TourThirdPhaseService {
    Tour playThirdPhase(Tour tour, Game game);
}
