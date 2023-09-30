package pl.Alski.Munch.logic.game.gameCreation;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.game.Game;

@Service
public interface GameMasterService {
    void startNextPlayerTour(Game game);
}
