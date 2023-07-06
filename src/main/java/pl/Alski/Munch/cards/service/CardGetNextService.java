package pl.Alski.Munch.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.entity.Game;

@Service
public interface CardGetNextService {
    <T extends DoorCard> Card getNextCard(Game game, T cardType);
}
