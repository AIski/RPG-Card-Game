package pl.Alski.Munch.logic.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.fight.Fight;
import pl.Alski.Munch.logic.fight.FightOutcome;

@Service
public interface FightLogicService {
    FightOutcome carryOutFight(Fight fight);
}
