package pl.Alski.Munch.tour.tourPhaseService;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.tour.Tour;

@Service
@AllArgsConstructor
public class TourPhaseServiceImpl implements TourPhaseService {

    private TourFirstPhaseServiceImpl firstPhaseService;
    private TourSecondPhaseServiceImpl secondPhaseService;
    private TourThirdPhaseServiceImpl thirdPhaseService;
    private TourFourthPhaseServiceImpl fourthPhaseService;

    @Override
    public Tour playFirstPhase(Tour tour, Game game) {return firstPhaseService.playFirstPhase(tour, game);}

    @Override
    public Tour playSecondPhase(Tour tour, Game game) {
        return secondPhaseService.playSecondPhase(tour, game);
    }

    @Override
    public Tour playThirdPhase(Tour tour, Game game) {
        return thirdPhaseService.playThirdPhase(tour, game);
    }

    @Override
    public Tour playFourthPhase(Tour tour, Game game) {
        return fourthPhaseService.playFourthPhase(tour, game);
    }


}
