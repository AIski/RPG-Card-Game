package pl.Alski.Munch.logic.queue;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.player.Player;

@Service
public interface QueueService {

    Player getNextPlayerInQueue(Game game);
}
