package pl.Alski.Munch.logic.cards.modifier;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.fight.Fight;

@Service
public interface ModifierDiceService {
    int getModifiers(Fight fight);
}
