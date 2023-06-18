package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.tour.Tour;

@Service
public interface TourPhaseService {
    public Tour playFirstPhase(Tour player);
    public Tour playSecondPhase(Tour tour);
    public Tour playThirdPhase(Tour tour);
    public Tour playFourthPhase(Tour tour);

}

