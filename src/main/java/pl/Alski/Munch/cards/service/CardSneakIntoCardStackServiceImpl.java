package pl.Alski.Munch.cards.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.entity.Game;

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
