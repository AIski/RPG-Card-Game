package pl.Alski.Munch.logic.cards.service.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.Card;
import pl.Alski.Munch.logic.game.Game;

@Service
public interface CardDiscardService {
    <T extends Card> void discardCard(T card, Game game);
}
