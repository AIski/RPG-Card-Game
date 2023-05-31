package pl.Alski.Munch.cards;

import lombok.Getter;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.doorCards.DoorCard;
import pl.Alski.Munch.cards.treasureCards.TreasureCard;

import java.util.Stack;

@Service
@Getter
public class CroupierService {

    private Stack<DoorCard> doorCardsStack;
    private Stack<TreasureCard> treasureCardsStack;
    private Stack<DoorCard> usedDoorCardsStack;
    private Stack<TreasureCard> usedTreasureCardsStack;

    void shuffle(Stack<Card> cardStack) {
    }

    DoorCard dealNextDoorCard() {
        return null;
    }

    TreasureCard dealNextTreasureCard() {
        return null;
    }




}
