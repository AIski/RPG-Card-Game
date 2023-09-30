package pl.Alski.Munch.logic.cards.service.impl;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.Card;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;
import pl.Alski.Munch.logic.cards.treasureCard.TreasureCard;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.game.service.GameSaveService;
import pl.Alski.Munch.logic.cards.service.service.CardShuffleService;
import pl.Alski.Munch.logic.cards.service.service.CardUsedDeckReshuffleService;

import java.util.Stack;

@Service
@AllArgsConstructor
public class CardUsedDeckReshuffleServiceImpl implements CardUsedDeckReshuffleService {
    private final static Logger logger = LoggerFactory.getLogger(CardUsedDeckReshuffleServiceImpl.class);
    private final CardShuffleService shuffleService;
    private final GameSaveService gameSaveService;

    @Override
    public <T extends Card> void reshuffleDeck(Game game, T card) {
        if (card instanceof DoorCard) {
            var tempStack = game.getUsedDoorCardsStack();
            shuffleService.shuffle(tempStack);
            logger.info("Shuffling UsedDoorCardStack and moving it to DoorCardStack");
            game.setDoorCardsStack(tempStack);
            game.setUsedDoorCardsStack(new Stack<DoorCard>());
            gameSaveService.save(game);
        }
        if (card instanceof TreasureCard) {
            var tempStack = game.getUsedTreasureCardsStack();
            shuffleService.shuffle(tempStack);
            logger.info("Shuffling UsedTreasureCardStack and moving it to TreasureCardStack");
            game.setTreasureCardsStack(tempStack);
            game.setUsedTreasureCardsStack(new Stack<TreasureCard>());
            gameSaveService.save(game);
        }
    }

}
