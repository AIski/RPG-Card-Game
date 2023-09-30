package pl.Alski.Munch.logic.cards.service.impl;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;
import pl.Alski.Munch.logic.cards.service.service.CardGetNextService;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.player.Player;
import pl.Alski.Munch.logic.cards.service.service.CardDealNextDoorCardToPlayerService;
import pl.Alski.Munch.logic.cards.service.service.CardDealService;

@Service
@AllArgsConstructor
public class CardDealNextDoorCardToPlayerServiceImpl implements CardDealNextDoorCardToPlayerService {
    private final static Logger logger = LoggerFactory.getLogger(CardDealNextDoorCardToPlayerServiceImpl.class);
    private CardDealService cardDealService;
    private CardGetNextService getNextCardService;

    public void dealNextDoorCard(Player player, Game game) {
        DoorCard nextCard = getNextCardService.getNextDoorCard(game);
        logger.info("Door card was dealt to " + player.getName());
        cardDealService.dealCardToPlayer(nextCard, player);
    }
}
