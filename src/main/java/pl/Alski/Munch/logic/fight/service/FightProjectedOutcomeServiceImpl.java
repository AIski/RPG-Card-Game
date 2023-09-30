package pl.Alski.Munch.logic.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.fight.Fight;
import pl.Alski.Munch.logic.fight.FightProjectedOutcome;

@Service
public class FightProjectedOutcomeServiceImpl implements FightProjectedOutcomeService{
    @Override
    public boolean checkIfPlayerWinsTheFight(Fight fight) {
        return false;
    }

    @Override
    public FightProjectedOutcome getFightProjectedOutcome(Fight fight) {
        return null;
    }
}
