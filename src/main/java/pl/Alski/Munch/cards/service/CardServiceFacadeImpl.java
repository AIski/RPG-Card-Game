package pl.Alski.Munch.cards.service;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.DAO.CardRepository;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.gameCreation.services.GameSaveService;
import pl.Alski.Munch.player.Player;

import java.util.Stack;


@Data
@NoArgsConstructor
public class CardServiceFacadeImpl implements CardServiceFacade {

    private final static Logger logger = LoggerFactory.getLogger(CardServiceFacadeImpl.class);
    private CardRepository cardRepository;
    private CardShuffleService shuffleService;
    private CardDealService cardDealService;
    private CardGetGameReadyService getCardsReadyService;

    public void getCardsReady(Game game) {
        getCardsReadyService.getCardsReady(game);
    }

    public void shuffleDoorCardsStack(Stack<DoorCard> doorCards) {
        shuffleService.shuffle(doorCards);
    }

    public void shuffleTreasureCardsStack(Stack<TreasureCard> treasureCards) {
        shuffleService.shuffle(treasureCards);
    }

    public void dealNextDoorCard(Player player, Game game) {
        DoorCard nextCard = doorCardsStack.pop();
        logger.info("Door card was dealt to " + player.getName());
        cardDealService.dealCardToPlayer(nextCard, player);
    }

    public void dealNextTreasureCard(Player player, Game game) {
        TreasureCard nextCard = treasureCardsStack.pop();
        logger.info("Treasure card was dealt to " + player.getName());
        cardDealService.dealCardToPlayer(nextCard, player);
    }

    @Override
    public <T extends DoorCard> T dealNextDoorCardOnTable(Game game) {
        T card = (T) doorCardsStack.pop();
        logger.info("Rolled + " + card.toString());
        return card;
    }

    @Override
    public <T extends TreasureCard> T dealNextTreasureCardOnTable(Game game) {
        T card = (T) treasureCardsStack.pop();
        logger.info("Rolled + " + card.toString());
        return card;
    }

    @Override
    public <T extends Card> void discardCard(T card, Game game) {

    }


}
