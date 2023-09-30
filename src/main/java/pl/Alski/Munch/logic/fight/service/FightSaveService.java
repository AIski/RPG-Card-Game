package pl.Alski.Munch.logic.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.fight.Fight;

@Service
public interface FightSaveService {
    void save(Fight fight);
}
