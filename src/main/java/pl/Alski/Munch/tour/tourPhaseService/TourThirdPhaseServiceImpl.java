package pl.Alski.Munch.tour.tourPhaseService;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.service.CardServiceFacade;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.moves.PlayerMove;
import pl.Alski.Munch.service.PlayerCommunicationService;
import pl.Alski.Munch.tour.Tour;
import pl.Alski.Munch.tour.TourStatus;
import pl.Alski.Munch.tour.TourPhase;

import java.util.List;

@Service
@AllArgsConstructor
public class TourThirdPhaseServiceImpl implements TourThirdPhaseService {


    private final static Logger logger = LoggerFactory.getLogger(TourThirdPhaseServiceImpl.class);
    private PlayerCommunicationService communicationService;
    private CardServiceFacade cardService;


    public Tour playThirdPhase(Tour tour, Game game) {
        Player player = tour.getPlayer();
        tour.setPhase(TourPhase.SEARCH_THE_ROOM);
        tour.setStatus(TourStatus.STARTED);

        player.setPlayerMoves(List.of(PlayerMove.ANSWER_QUESTION));
        boolean playerResponse = communicationService.askPlayer(player, "You can now Search the Room and pick a Door Card. Do you want it? (It would be stupid not to take it!)");
        if (playerResponse) {
            logger.info(player.getName() + " decides to Search the Room and pick extra Door Card.");
            cardService.dealNextDoorCard(tour.getPlayer(), game);
        } else {
            logger.info(player.getName() + " decided not to Search the Room and will not pick extra Door Card... Wow!");
        }

        logger.info(player.getName() + " ended his third Tour Phase.");
        tour.setStatus(TourStatus.FINISHED);
        return tour;
    }
}
