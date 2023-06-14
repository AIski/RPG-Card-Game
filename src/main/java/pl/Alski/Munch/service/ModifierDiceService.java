package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.fight.Fight;

@Service
public interface ModifierDiceService {
    int getModifiers(Fight fight);
}
