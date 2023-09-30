package pl.Alski.Munch.logic.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.fight.FightOutcome;

@Service
public interface FightLootService {
    void distributeLoot(FightOutcome fightoutCome);
    //check player is eligible for loot, if so, call the loot
}
