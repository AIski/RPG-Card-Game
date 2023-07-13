package pl.Alski.Munch.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.fight.Fight;

@Service
public interface FightSaveService {
    void save(Fight fight);
}
