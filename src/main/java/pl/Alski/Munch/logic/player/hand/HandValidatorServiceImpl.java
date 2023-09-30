package pl.Alski.Munch.logic.player.hand;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.player.Player;
import pl.Alski.Munch.logic.cards.modifier.ModifierService;

@Service
public class HandValidatorServiceImpl implements HandValidatorService {

    private final static Logger logger = LoggerFactory.getLogger(HandValidatorServiceImpl.class);
    private ModifierService modifierService;

    @Override
    public boolean validateHand(Player player) {
        var playerHandSizeWithModifiers = player.getGameCharacter().getHandSize() + modifierService.getHandModifier(player);

        boolean result = player.getHand().getCards().size() <= playerHandSizeWithModifiers;
        if (result) {
            logger.info(player.getName() + "has acceptable amount of cards on his hand.");
        } else {
            logger.info(player.getName() + "has Too many cards on his hand. Time to Show Mercy!");
        }
        return result;
    }
}
