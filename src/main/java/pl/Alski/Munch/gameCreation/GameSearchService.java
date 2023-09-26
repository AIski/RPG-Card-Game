package pl.Alski.Munch.gameCreation;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.moves.PlayerDetails;

@Service
public interface GameSearchService {
    boolean joinGameSearchQueue(PlayerDetails playerDetails);
}
