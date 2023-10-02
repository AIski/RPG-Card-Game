package pl.Alski.Munch.logic.game.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.game.GameCreationResponse;
import pl.Alski.Munch.logic.player.Player;

import java.util.Queue;

@Service
public interface GameCreateFromQueueWithSizeService {
     GameCreationResponse createGame(Queue<Player> queue, Integer gameSize);
}
