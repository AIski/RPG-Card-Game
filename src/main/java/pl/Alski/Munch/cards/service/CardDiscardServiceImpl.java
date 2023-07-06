package pl.Alski.Munch.cards.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.gameCreation.services.GameSaveService;


@Service
@AllArgsConstructor
public class CardDiscardServiceImpl implements CardDiscardService{
    private final static Logger logger = LoggerFactory.getLogger(CardDiscardServiceImpl.class);
    private GameSaveService gameSaveService;

    @Override
    public <T extends Card> void discardCard(T card, Game game) {
        if (card instanceof DoorCard) {
            game.getUsedDoorCardsStack().add((DoorCard) card);
        } else {
            game.getUsedTreasureCardsStack().add((TreasureCard) card);
        }
        logger.info("Discarded card: " + card.toString());
        gameSaveService.save(game);
    }
}
