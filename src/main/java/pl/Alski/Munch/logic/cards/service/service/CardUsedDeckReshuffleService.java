package pl.Alski.Munch.logic.cards.service.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.Card;
import pl.Alski.Munch.logic.game.Game;

@Service
public interface CardUsedDeckReshuffleService {
     <T extends Card> void reshuffleDeck(Game game, T card);
}
