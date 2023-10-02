package pl.Alski.Munch.logic.game.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.game.GameCreationRequest;
import pl.Alski.Munch.logic.game.GameCreationResponse;
import pl.Alski.Munch.logic.player.Player;

import java.util.Queue;

@Service
@AllArgsConstructor
public class GameCreateFromQueueWithSizeServiceImpl implements GameCreateFromQueueWithSizeService {
private final GameCreateService gameCreateService;

    @Override
    public GameCreationResponse createGame(Queue<Player> queue, Integer gameSize) {
        if (gameSize < 3 || gameSize > 6) {
            throw new IllegalArgumentException("Game Size must be set between 3 and 6 players.");
        }
        GameCreationRequest gameRequest = new GameCreationRequest();
        for (int i = 0; i < gameSize; i++) {
            var temPlayer = queue.poll();
            gameRequest.addPlayer(temPlayer);
        }

        return gameCreateService.createNewGame(gameRequest);
    }
}
