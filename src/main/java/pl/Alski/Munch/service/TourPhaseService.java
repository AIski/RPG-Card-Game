package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.tour.TourPhase;

@Service
public interface TourPhaseService {
    public void startFirstPhase(TourPhase tourPhase);
    public void startSecondPhase(TourPhase tourPhase);
    public void startThirdPhase(TourPhase tourPhase);
    public void startFourthPhase(TourPhase tourPhase);

}
