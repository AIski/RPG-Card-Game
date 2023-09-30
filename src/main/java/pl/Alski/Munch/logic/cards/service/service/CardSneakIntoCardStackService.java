package pl.Alski.Munch.logic.cards.service.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;
import pl.Alski.Munch.logic.cards.treasureCard.TreasureCard;
import pl.Alski.Munch.logic.game.Game;

import java.util.Stack;

@Service
public interface CardSneakIntoCardStackService {
    Stack<DoorCard> sneakPeakIntoDoorCardStack(Game game);
    Stack<TreasureCard> sneakPeakIntoTreasureCardsStack(Game game);
    Stack<DoorCard> sneakPeakIntoUsedDoorCardsStack(Game game);
    Stack<TreasureCard> sneakPeakIntoUsedTreasureCardsStack(Game game);

}
