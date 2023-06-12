package pl.Alski.Munch.cards.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.DoorCard;
import pl.Alski.Munch.cards.treasureCards.TreasureCard;

import java.util.Stack;

@Service
@AllArgsConstructor
public class CardSneakIntoCardStackServiceImpl implements CardSneakIntoCardStackService {

    CardServiceFacadeImpl cardService;

    public Stack<DoorCard> sneakPeakIntoDoorCardStack() {
        return cardService.getDoorCardsStack();
    }

    public Stack<TreasureCard> sneakPeakIntoTreasureCardsStack() {
        return cardService.getTreasureCardsStack();
    }

    public Stack<DoorCard> sneakPeakIntoUsedDoorCardsStack() {
        return cardService.getUsedDoorCardsStack();
    }

    public Stack<TreasureCard> sneakPeakIntoUsedTreasureCardsStack() {
        return cardService.getUsedTreasureCardsStack();
    }
}
