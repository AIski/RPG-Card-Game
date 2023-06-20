package pl.Alski.Munch.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.fight.FightOutcome;

@Service
public interface FightCleanUpService {
    void clean(FightOutcome fightOutcome);
}
