package pl.Alski.Munch.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.DoorCard;
import pl.Alski.Munch.cards.treasureCards.TreasureCard;

import java.util.Stack;

@Service
public interface CardSneakIntoCardStackService {
    Stack<DoorCard> sneakPeakIntoDoorCardStack();

    Stack<TreasureCard> sneakPeakIntoTreasureCardsStack();

    Stack<DoorCard> sneakPeakIntoUsedDoorCardsStack();

    Stack<TreasureCard> sneakPeakIntoUsedTreasureCardsStack();

}
