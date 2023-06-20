package pl.Alski.Munch.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.fight.FightOutcome;

@Service
public interface FightLootService {
    void distributeLoot(FightOutcome fightoutCome);
    //check player is eligible for loot, if so, call the loot
}
