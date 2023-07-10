package pl.Alski.Munch.cards.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.player.Player;

@Service
@AllArgsConstructor
public class CardDealNextTreasureCardToPlayerServiceImpl implements  CardDealNextTreasureCardToPlayerService{
    private final static Logger logger = LoggerFactory.getLogger(CardDealNextTreasureCardToPlayerServiceImpl.class);
    private CardDealService cardDealService;
    private CardGetNextService getNextCardService;

    public void dealNextTreasureCard(Player player, Game game) {
        TreasureCard nextCard = getNextCardService.getNextTreasureCard(game);
        logger.info("Treasure card was dealt to " + player.getName());
        cardDealService.dealCardToPlayer(nextCard, player);
    }
}
