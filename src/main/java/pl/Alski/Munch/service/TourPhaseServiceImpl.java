package pl.Alski.Munch.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.tour.TourPhase;
import pl.Alski.Munch.tour.TourPhaseName;

@Service
@AllArgsConstructor
public class TourPhaseServiceImpl implements TourPhaseService{

    private TourPhaseName tourPhase;

    @Override
    public void startFirstPhase(TourPhase tourPhase) {

    }

    @Override
    public void startSecondPhase(TourPhase tourPhase) {

    }

    @Override
    public void startThirdPhase(TourPhase tourPhase ) {

    }

    @Override
    public void startFourthPhase(TourPhase tourPhase) {

    }


}
