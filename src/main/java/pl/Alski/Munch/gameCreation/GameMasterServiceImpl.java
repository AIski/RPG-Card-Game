package pl.Alski.Munch.gameCreation;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.fight.service.PlayerPossibleMovesService;
import pl.Alski.Munch.moves.PlayerMove;
import pl.Alski.Munch.service.QueueService;
import pl.Alski.Munch.tour.TourService;

import java.util.List;


@Service
@AllArgsConstructor
public class GameMasterServiceImpl implements GameMasterService {

    @OneToOne
    private final static Logger logger = LoggerFactory.getLogger(GameMasterServiceImpl.class);
    private Game game;
    private QueueService queueService;
    private TourService tourService;
    private PlayerPossibleMovesService playerMovesService;


    @Override
    public void startNextPlayerTour() {
        while (!game.getIsFinished()) {
            logger.info("Inside GameMasterService.startNextPlayerTour()");
            for (int i = 0; i < game.getPlayers().size(); i++) {
                var tempPlayer = queueService.getNextPlayerInQueue();
                playerMovesService.setPlayerMoves(tempPlayer, List.of(PlayerMove.START_TOUR));
                logger.info(tempPlayer.getName()+ "is about to start his/hers tour.");
                var spectators = game.getPlayers();
                spectators.remove(tempPlayer);
                playerMovesService.setPlayerMoves(spectators, List.of(PlayerMove.DO_NOTHING));
            }
        }
    }

}
