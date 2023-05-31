package pl.Alski.Munch.cards;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.DoorCard;
import pl.Alski.Munch.cards.treasureCards.TreasureCard;

import java.util.Stack;

@Service
@AllArgsConstructor
public class SneakAPeakIntoCardStackService {

    CroupierService croupierService;

    Stack<DoorCard> sneakPeakIntoDoorCardStack() {
        return croupierService.getDoorCardsStack();
    }
    Stack<TreasureCard> sneakPeakIntoTreasureCardsStack() {
        return croupierService.getTreasureCardsStack();
    }
    Stack<DoorCard> sneakPeakIntoUsedDoorCardsStack() {
        return croupierService.getUsedDoorCardsStack();
    }
    Stack<TreasureCard> sneakPeakIntoUsedTreasureCardsStack() {
        return croupierService.getUsedTreasureCardsStack();
    }
}
