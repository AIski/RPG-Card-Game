package pl.Alski.Munch.logic.cards.modifier.modifiers.dice;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.fight.Fight;

@Service
public class ModifierDiceServiceImpl implements ModifierDiceService{
    @Override
    public int getModifiers(Fight fight) {
        return 0;
    }
}
