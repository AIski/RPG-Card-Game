package pl.Alski.Munch.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.entity.Game;

@Service
public interface CardGetNextService {
    <T extends DoorCard> DoorCard getNextDoorCard(Game game);
    <T extends TreasureCard> TreasureCard getNextTreasureCard(Game game);
}
