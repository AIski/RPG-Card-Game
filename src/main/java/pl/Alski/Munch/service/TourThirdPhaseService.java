package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.tour.Tour;
import pl.Alski.Munch.tour.TourPhase;
import pl.Alski.Munch.tour.TourStatus;

@Service
public class TourThirdPhaseService {
    public Tour playThirdPhase(Tour tour) {
        tour.setPhase(TourPhase.SEARCH_THE_ROOM);
        //Ask player, if he want to pick extra door card.

        boolean playerResponse = playerCommunicationService.askPlayer();
        cardService.dealNextDoorCard(tour.getPlayer());

        logger.info(currentPlayer.getName() + " ended his third Tour Phase.");
        tour.setStatus(TourStatus.FINISHED);
        return tour;
    }
}
