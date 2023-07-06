package pl.Alski.Munch.cards.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.DAO.CardRepository;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.gameCreation.services.GameSaveService;

import java.util.Stack;

@Service
@AllArgsConstructor
public class CardGetGameReadyServiceImpl implements CardGetGameReadyService{
    private final static Logger logger = LoggerFactory.getLogger(CardGetGameReadyServiceImpl.class);
    private CardShuffleService shuffleService;
    private CardRepository cardRepository;
    private GameSaveService gameSaveService;

    @Override
    public void getCardsReady(Game game) {
        Stack<DoorCard> doorCards = new Stack<>();
        logger.info("Getting Door Cards From Repository.");
        doorCards.addAll(cardRepository.getAllDoorCards());

        Stack<TreasureCard> treasureCards = new Stack<>();
        logger.info("Getting Treasure Cards From Repository.");
        treasureCards.addAll(cardRepository.getAllTreasureCards());

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
