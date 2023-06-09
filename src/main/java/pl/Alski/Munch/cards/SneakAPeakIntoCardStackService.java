package pl.Alski.Munch.cards;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.DoorCard;
import pl.Alski.Munch.cards.treasureCards.TreasureCard;

import java.util.Stack;

@Service
@AllArgsConstructor
public class SneakAPeakIntoCardStackService {

    CardServiceImpl cardService;

    Stack<DoorCard> sneakPeakIntoDoorCardStack() {
        return cardService.getDoorCardsStack();
    }
    Stack<TreasureCard> sneakPeakIntoTreasureCardsStack() {
        return cardService.getTreasureCardsStack();
    }
    Stack<DoorCard> sneakPeakIntoUsedDoorCardsStack() {
        return cardService.getUsedDoorCardsStack();
    }
    Stack<TreasureCard> sneakPeakIntoUsedTreasureCardsStack() {
        return cardService.getUsedTreasureCardsStack();
    }
}
