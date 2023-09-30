package pl.Alski.Munch.logic.cards.service.impl;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.service.service.CardDealNextTreasureCardToPlayerService;
import pl.Alski.Munch.logic.cards.service.service.CardGetNextService;
import pl.Alski.Munch.logic.cards.treasureCard.TreasureCard;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.player.Player;
import pl.Alski.Munch.logic.cards.service.service.CardDealService;

@Service
@AllArgsConstructor
public class CardDealNextTreasureCardToPlayerServiceImpl implements CardDealNextTreasureCardToPlayerService {
    private final static Logger logger = LoggerFactory.getLogger(CardDealNextTreasureCardToPlayerServiceImpl.class);
    private CardDealService cardDealService;
    private CardGetNextService getNextCardService;

    public void dealNextTreasureCard(Player player, Game game) {
        TreasureCard nextCard = getNextCardService.getNextTreasureCard(game);
        logger.info("Treasure card was dealt to " + player.getName());
        cardDealService.dealCardToPlayer(nextCard, player);
    }
}
