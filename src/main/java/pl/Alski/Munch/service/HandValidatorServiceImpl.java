package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Player;

@Service
public class HandValidatorServiceImpl implements HandValidatorService {

    @Override
    public boolean validateHand(Player player) {
        return player.getHand().size() <= player.getCharacter().getHandSize();
    }
}
