package pl.Alski.Munch.logic.cards.service.impl;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.service.service.CardGetGameReadyService;
import pl.Alski.Munch.logic.cards.service.service.CardShuffleService;
import pl.Alski.Munch.dao.DoorCardRepository;
import pl.Alski.Munch.dao.TreasureCardRepository;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;
import pl.Alski.Munch.logic.cards.treasureCard.TreasureCard;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.game.service.GameSaveService;

import java.util.Stack;

@Service
@AllArgsConstructor
public class CardGetGameReadyServiceImpl implements CardGetGameReadyService {
    private final static Logger logger = LoggerFactory.getLogger(CardGetGameReadyServiceImpl.class);
    private CardShuffleService shuffleService;
    private DoorCardRepository doorCardRepository;
    private TreasureCardRepository treasureCardRepository;
    private GameSaveService gameSaveService;

    @Override
    public void getCardsReady(Game game) {
        Stack<DoorCard> doorCards = new Stack<>();
        logger.info("Getting Door Cards From Repository.");
        doorCards.addAll(doorCardRepository.findAll());

        Stack<TreasureCard> treasureCards = new Stack<>();
        logger.info("Getting Treasure Cards From Repository.");
        treasureCards.addAll(treasureCardRepository.findAll());

        logger.info("Shuffling Door Cards Stack.");
        shuffleService.shuffle(doorCards);
        logger.info("Shuffling Treasure Cards Stack.");
        shuffleService.shuffle(treasureCards);

        game.setDoorCardsStack(doorCards);
        game.setTreasureCardsStack(treasureCards);
        game.setUsedDoorCardsStack(new Stack<>());
        game.setUsedTreasureCardsStack(new Stack<>());

        logger.info("Saving the game.");
        gameSaveService.save(game);
        logger.info("The Cards are ready.");
    }
}
