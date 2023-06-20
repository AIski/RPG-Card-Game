package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.fight.Fight;

@Service
public interface ModifierDiceService {
    int getModifiers(Fight fight);
}
