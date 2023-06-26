package pl.Alski.Munch.gameCreation;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.service.QueueService;
import pl.Alski.Munch.tour.TourService;


@Service
@AllArgsConstructor
public class GameMasterServiceImpl implements GameMasterService {

    @OneToOne
    private final static Logger logger = LoggerFactory.getLogger(GameMasterServiceImpl.class);
    private Game game;
    private QueueService queueService;
    private TourService tourService;


    @Override
    public void playTheGame() {
        while (!game.getIsFinished()) {
            logger.info("Inside GameMasterService.playTheGame()");
            for (int i = 0; i < game.getPlayers().size(); i++) {
               var tempPlayer = queueService.getNextPlayerInQueue();
               tourService.playPlayerTour(tempPlayer);
            }
        }

        // TODO: this need to be reworked I think
    }
}
