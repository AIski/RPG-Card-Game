package pl.Alski.Munch.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;

@Service
public interface CardGetGameReadyService {
    void getCardsReady(Game game);
}
