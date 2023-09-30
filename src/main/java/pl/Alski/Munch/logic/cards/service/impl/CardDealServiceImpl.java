package pl.Alski.Munch.logic.cards.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.Card;
import pl.Alski.Munch.logic.player.Player;
import pl.Alski.Munch.logic.cards.service.service.CardDealService;

@Service
public class CardDealServiceImpl implements CardDealService {
    private final static Logger logger = LoggerFactory.getLogger(CardDealServiceImpl.class);


    @Override
    public <T extends Card> void dealCardToPlayer(T card, Player player) {
        logger.info(card.toString() + " was dealt to " + player.getName());
        player.getHand().getCards().add(card);
    }

}
