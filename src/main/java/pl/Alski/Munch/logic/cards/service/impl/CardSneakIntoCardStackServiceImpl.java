package pl.Alski.Munch.logic.cards.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;
import pl.Alski.Munch.logic.cards.treasureCard.TreasureCard;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.cards.service.CardServiceFacadeImpl;
import pl.Alski.Munch.logic.cards.service.service.CardSneakIntoCardStackService;

import java.util.Stack;

@Service
@AllArgsConstructor
public class CardSneakIntoCardStackServiceImpl implements CardSneakIntoCardStackService {

    CardServiceFacadeImpl cardService;

    public Stack<DoorCard> sneakPeakIntoDoorCardStack(Game game) {
        return game.getDoorCardsStack();
    }

    public Stack<TreasureCard> sneakPeakIntoTreasureCardsStack(Game game) {
        return game.getTreasureCardsStack();
    }

    public Stack<DoorCard> sneakPeakIntoUsedDoorCardsStack(Game game) {
        return game.getUsedDoorCardsStack();
    }

    public Stack<TreasureCard> sneakPeakIntoUsedTreasureCardsStack(Game game) {
        return game.getUsedTreasureCardsStack();
    }
}
