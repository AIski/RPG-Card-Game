package pl.Alski.Munch.cards.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.DAO.CardRepository;
import pl.Alski.Munch.cards.doorCards.DoorCard;
import pl.Alski.Munch.cards.treasureCards.TreasureCard;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.player.Player;

import java.util.Stack;


@Service
@Getter
@AllArgsConstructor
public class CardServiceFacadeImpl implements CardServiceFacade{

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

    @Override
    public <T extends Card> T dealNextDoorCardOnTable() {
        return (T) doorCardsStack.pop();
    }

    @Override
    public <T extends Card> T dealNextTreasureCardOnTable() {
        return (T) treasureCardsStack.pop();
    }

    @Override
    public <T extends Card> void discardCard(T card) {
         if (card instanceof DoorCard) {
             usedDoorCardsStack.add((DoorCard) card);
         }
         else {
             usedTreasureCardsStack.add((TreasureCard) card);
         }
    }


    public void getCardsReady() {
        loadDoorCardsFromRepository();
        shuffleDoorCardsStack();
        shuffleTreasureCardsStack();
    }
}
