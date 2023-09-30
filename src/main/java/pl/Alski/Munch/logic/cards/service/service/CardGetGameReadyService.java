package pl.Alski.Munch.logic.cards.service.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.game.Game;

@Service
public interface CardGetGameReadyService {
    void getCardsReady(Game game);
}
