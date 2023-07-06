package pl.Alski.Munch.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.entity.Game;

import java.util.Stack;

@Service
public interface CardUsedDeckReshuffleService {
     <T extends Card> void reshuffleDeck(Game game, T card);
}
