package pl.Alski.Munch.tour.tourPhaseService;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.tour.Tour;

@Service
public interface TourSaveService {
    void save(Tour tour);
}
