package pl.Alski.Munch.logic.player.hand;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.player.Player;

@Service
public interface HandValidatorService {
    boolean validateHand(Player player);
}
