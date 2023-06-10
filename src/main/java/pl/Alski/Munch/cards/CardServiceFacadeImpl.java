package pl.Alski.Munch.cards;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.DAO.CardRepository;
import pl.Alski.Munch.cards.doorCards.DoorCard;
import pl.Alski.Munch.cards.treasureCards.TreasureCard;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.entity.Player;
import pl.Alski.Munch.service.card.DealCardService;
import pl.Alski.Munch.service.card.CardShuffleService;

import java.util.Stack;


@Service
@Getter
@AllArgsConstructor
public class CardServiceFacadeImpl {

    private final CardRepository cardRepository;
    private final CardShuffleService shuffleService;
    private final DealCardService dealCardService;

    private Game game;
    private Stack<DoorCard> doorCardsStack;
    private Stack<TreasureCard> treasureCardsStack;
    private Stack<DoorCard> usedDoorCardsStack;
    private Stack<TreasureCard> usedTreasureCardsStack;

    public void loadDoorCardsFromRepository(){
        doorCardsStack.addAll(cardRepository.getAllDoorCards());
        treasureCardsStack.addAll(cardRepository.getAllTreasureCards());
    }

    public void shuffleDoorCardsStack() {
        shuffleService.shuffle(doorCardsStack);
    }

    public void shuffleTreasureCardsStack() {
        shuffleService.shuffle(treasureCardsStack);
    }

   public void dealNextDoorCard(Player player) {
        DoorCard nextCard = doorCardsStack.pop();
        dealCardService.dealCardToPlayer(nextCard, player);
    }
    public void dealNextTreasureCard(Player player) {
        TreasureCard nextCard = treasureCardsStack.pop();
        dealCardService.dealCardToPlayer(nextCard, player);
    }


    public void getCardsReady() {
        loadDoorCardsFromRepository();
        shuffleDoorCardsStack();
        shuffleTreasureCardsStack();
    }
}
