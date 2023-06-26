package pl.Alski.Munch.cards.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final static Logger logger = LoggerFactory.getLogger(CardServiceFacadeImpl.class);
    private final CardRepository cardRepository;
    private final CardShuffleService shuffleService;
    private final CardDealService cardDealService;

    private Game game;
    private Stack<DoorCard> doorCardsStack;
    private Stack<TreasureCard> treasureCardsStack;
    private Stack<DoorCard> usedDoorCardsStack;
    private Stack<TreasureCard> usedTreasureCardsStack;


    public void getCardsReady() {
        doorCardsStack.addAll(cardRepository.getAllDoorCards());
        treasureCardsStack.addAll(cardRepository.getAllTreasureCards());
        shuffleService.shuffle(doorCardsStack);
        shuffleService.shuffle(treasureCardsStack);
    }

    public void shuffleDoorCardsStack() {
        shuffleService.shuffle(doorCardsStack);
    }

    public void shuffleTreasureCardsStack() {
        shuffleService.shuffle(treasureCardsStack);
    }

   public void dealNextDoorCard(Player player) {
        DoorCard nextCard = doorCardsStack.pop();
        logger.info("Door card was dealt to "+player.getName());
        cardDealService.dealCardToPlayer(nextCard, player);
    }

    public void dealNextTreasureCard(Player player) {
        TreasureCard nextCard = treasureCardsStack.pop();
        logger.info("Treasure card was dealt to "+player.getName());
        cardDealService.dealCardToPlayer(nextCard, player);
    }

    @Override
    public <T extends DoorCard> T dealNextDoorCardOnTable() {
        T card = (T) doorCardsStack.pop();
        logger.info("Rolled + " + card.toString());
        return card;
    }

    @Override
    public <T extends TreasureCard> T dealNextTreasureCardOnTable() {
        T card = (T) treasureCardsStack.pop();
        logger.info("Rolled + " + card.toString());
        return card;
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




}
