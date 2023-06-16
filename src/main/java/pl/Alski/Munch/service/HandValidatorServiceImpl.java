package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.player.Player;

@Service
public class HandValidatorServiceImpl implements HandValidatorService {

    @Override
    public boolean validateHand(Player player) {
        return player.getHand().size() <= player.getCharacter().getHandSize();
        //TODO this, check all modifiers, if player can hold more cards.
    }
}
