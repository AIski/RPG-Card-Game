package pl.Alski.Munch.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.entity.Game;

@Service
public interface CardDiscardService {
    <T extends Card> void discardCard(T card, Game game);
}
