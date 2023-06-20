package pl.Alski.Munch.tour.tourPhaseService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.tour.Tour;

@Service
@AllArgsConstructor
public class TourPhaseServiceImpl implements TourPhaseService {

    private TourFirstPhaseServiceImpl firstPhaseService;
    private TourSecondPhaseServiceImpl secondPhaseService;
    private TourThirdPhaseServiceImpl thirdPhaseService;
    private TourFourthPhaseServiceImpl fourthPhaseService;

    @Override
    public Tour playFirstPhase(Tour tour) {return firstPhaseService.playFirstPhase(tour);}

    @Override
    public Tour playSecondPhase(Tour tour) {
        return secondPhaseService.playSecondPhase(tour);
    }

    @Override
    public Tour playThirdPhase(Tour tour) {
        return thirdPhaseService.playThirdPhase(tour);
    }

    @Override
    public Tour playFourthPhase(Tour tour) {
        return fourthPhaseService.playFourthPhase(tour);
    }


}
