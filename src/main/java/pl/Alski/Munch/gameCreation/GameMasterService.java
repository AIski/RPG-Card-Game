package pl.Alski.Munch.gameCreation;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;

@Service
public interface GameMasterService {
    void startNextPlayerTour(Game game);
}
