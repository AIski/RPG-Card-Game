package pl.Alski.Munch.logic.cards.service.impl;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;
import pl.Alski.Munch.logic.cards.service.service.CardGetNextService;
import pl.Alski.Munch.logic.cards.treasureCard.TreasureCard;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.player.equipment.item.slots.Helmet;
import pl.Alski.Munch.logic.cards.doorCard.monster.Monster;
import pl.Alski.Munch.logic.cards.service.service.CardUsedDeckReshuffleService;

@Service
@AllArgsConstructor
public class CardGetNextServiceImpl implements CardGetNextService {
    private final static Logger logger = LoggerFactory.getLogger(CardGetNextServiceImpl.class);
    private final CardUsedDeckReshuffleService cardService;

    public <T extends DoorCard> DoorCard getNextDoorCard(Game game) {
        logger.info("CardGetNextServiceImpl getting next door card");
        if (game.getDoorCardsStack().size() == 0) {
            logger.info("CardGetNextServiceImpl run out of door cards...");
            cardService.reshuffleDeck(game, new Monster());
        }
        return game.getDoorCardsStack().pop();
    }

    public <T extends TreasureCard> TreasureCard getNextTreasureCard(Game game) {
        logger.info("CardGetNextServiceImpl getting next treasure card");
        if (game.getTreasureCardsStack().size() == 0) {
            logger.info("CardGetNextServiceImpl run out of treasure cards...");
            cardService.reshuffleDeck(game, new Helmet());
        }
        return game.getTreasureCardsStack().pop();
    }


}
