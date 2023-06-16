package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.tour.Tour;

@Service
public interface TourPhaseService {
    public void startFirstPhase(Tour player);
    public void startSecondPhase(Tour tour);
    public void startThirdPhase(Tour tour);
    public void startFourthPhase(Tour tour);

}
