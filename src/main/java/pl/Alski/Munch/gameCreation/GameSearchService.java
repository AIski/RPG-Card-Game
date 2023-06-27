package pl.Alski.Munch.gameCreation;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.moves.PlayerDetails;

@Service
public interface GameSearchService {
    void joinGameSearchQueue(PlayerDetails playerDetails);
}
