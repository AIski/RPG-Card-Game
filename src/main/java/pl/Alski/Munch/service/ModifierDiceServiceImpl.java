package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.fight.Fight;

@Service
public class ModifierDiceServiceImpl implements ModifierDiceService{
    @Override
    public int getModifiers(Fight fight) {
        return 0;
    }
}
