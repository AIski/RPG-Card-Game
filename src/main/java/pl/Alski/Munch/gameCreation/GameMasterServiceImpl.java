package pl.Alski.Munch.gameCreation;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.fight.service.PlayerPossibleMovesService;
import pl.Alski.Munch.moves.PlayerMove;
import pl.Alski.Munch.service.QueueService;

import java.util.List;


@Service
@AllArgsConstructor
public class GameMasterServiceImpl implements GameMasterService {
    private final static Logger logger = LoggerFactory.getLogger(GameMasterServiceImpl.class);
    private QueueService queueService;
    private PlayerPossibleMovesService playerMovesService;

    @Override
    public void startNextPlayerTour(Game game) {
        while (!game.getIsFinished()) {
            logger.info("Inside GameMasterService.startNextPlayerTour()");
            for (int i = 0; i < game.getPlayers().size(); i++) {
                var tempPlayer = queueService.getNextPlayerInQueue(game);
                playerMovesService.setPlayerMoves(tempPlayer, List.of(PlayerMove.START_TOUR));
                logger.info(tempPlayer.getName()+ "is about to start his/hers tour.");
                var spectators = game.getPlayers();
                spectators.remove(tempPlayer);
                playerMovesService.setPlayerMoves(spectators, List.of(PlayerMove.DO_NOTHING));
            }
        }
    }

}
