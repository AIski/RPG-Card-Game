package pl.Alski.Munch.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.entity.Game;

import java.util.Stack;

@Service
public interface CardSneakIntoCardStackService {
    Stack<DoorCard> sneakPeakIntoDoorCardStack(Game game);
    Stack<TreasureCard> sneakPeakIntoTreasureCardsStack(Game game);
    Stack<DoorCard> sneakPeakIntoUsedDoorCardsStack(Game game);
    Stack<TreasureCard> sneakPeakIntoUsedTreasureCardsStack(Game game);

}
