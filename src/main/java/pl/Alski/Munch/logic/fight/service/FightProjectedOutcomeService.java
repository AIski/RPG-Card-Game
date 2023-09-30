package pl.Alski.Munch.logic.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.fight.Fight;
import pl.Alski.Munch.logic.fight.FightProjectedOutcome;

@Service
public interface FightProjectedOutcomeService {
     boolean checkIfPlayerWinsTheFight(Fight fight);

    FightProjectedOutcome getFightProjectedOutcome(Fight fight);
}
