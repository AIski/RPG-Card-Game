package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Player;
import pl.Alski.Munch.tour.Tour;
import pl.Alski.Munch.tour.TourPhase;

@Service
public interface TourPhaseService {
    public void startFirstPhase(Tour player);
    public void startSecondPhase(Tour tour);
    public void startThirdPhase(Tour tour);
    public void startFourthPhase(Tour tour);

}
