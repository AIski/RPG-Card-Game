package pl.Alski.Munch.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.fight.Fight;
import pl.Alski.Munch.fight.FightProjectedOutcome;

@Service
public interface FightProjectedOutcomeService {
     boolean checkIfPlayerWinsTheFight(Fight fight);

    FightProjectedOutcome getFightProjectedOutcome(Fight fight);
}
