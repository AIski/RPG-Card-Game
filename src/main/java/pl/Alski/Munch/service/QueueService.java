package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.player.Player;

@Service
public interface QueueService {

    Player getNextPlayerInQueue(Game game);
}
