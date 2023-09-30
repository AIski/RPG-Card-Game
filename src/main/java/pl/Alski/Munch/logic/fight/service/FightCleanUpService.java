package pl.Alski.Munch.logic.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.fight.FightOutcome;

@Service
public interface FightCleanUpService {
    void clean(FightOutcome fightOutcome, Game game);
}
