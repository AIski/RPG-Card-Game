package pl.Alski.Munch.cards.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.player.Player;

@Service
public class DealCardServiceImpl implements DealCardService {
    private final static Logger logger = LoggerFactory.getLogger(DealCardServiceImpl.class);


    @Override
    public <T extends Card> void dealCardToPlayer(T card, Player player) {
        logger.info(card.toString() + " was dealt to " + player.getName());
        player.getHand().add(card);
    }

}
