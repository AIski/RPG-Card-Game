package pl.Alski.Munch.logic.game.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.game.Game;

@Service
public interface GameStartNextPlayerTourService {
    void startNextPlayerTour(Game game);
}
