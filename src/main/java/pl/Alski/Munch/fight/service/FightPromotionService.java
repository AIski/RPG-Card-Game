package pl.Alski.Munch.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.fight.FightOutcome;

@Service
public interface FightPromotionService {
    void promote(FightOutcome fightoutCome);
    //check player is eligible for promotion
    // if so, promote him


}
