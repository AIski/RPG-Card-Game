package pl.Alski.Munch.cards;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.DAO.CardRepository;
import pl.Alski.Munch.cards.doorCards.DoorCard;
import pl.Alski.Munch.cards.treasureCards.TreasureCard;

import java.util.Stack;


@Service
@Getter
@AllArgsConstructor
public class CardServiceImpl {

    private final CardRepository cardRepository;
    private final CardShuffleService shuffleService;

    private Stack<DoorCard> doorCardsStack;
    private Stack<TreasureCard> treasureCardsStack;
    private Stack<DoorCard> usedDoorCardsStack;
    private Stack<TreasureCard> usedTreasureCardsStack;

    public void shuffleDoorCardsStack() {
        shuffleService.shuffle(doorCardsStack);
    }

    public void shuffleTreasureCardsStack() {
        shuffleService.shuffle(treasureCardsStack);
    }

   public DoorCard dealNextDoorCard() {
        return null;
    }
    public TreasureCard dealNextTreasureCard() {
        return null;
    }

    public void loadDoorCardsFromRepository(){
       doorCardsStack.addAll(
               cardRepository.getAllDoorCards()
       );
       treasureCardsStack.addAll(
               cardRepository.getAllTreasureCards()
       );
    }



}
