package pl.Alski.Munch.logic.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.fight.FightOutcome;

@Service
public interface FightPromotionService {
    void promote(FightOutcome fightoutCome);
    //check player is eligible for promotion
    // if so, promote him


}
