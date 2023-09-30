package pl.Alski.Munch.logic.game.gameCreation;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.moves.PlayerDetails;

@Service
public interface GameSearchService {
    boolean joinGameSearchQueue(PlayerDetails playerDetails);
}
