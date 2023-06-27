package pl.Alski.Munch.fight.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.monster.Monster;
import pl.Alski.Munch.cards.service.CardServiceFacade;
import pl.Alski.Munch.fight.FightOutcome;


@Service
public class FightCleanUpServiceImpl implements FightCleanUpService{
    private final static Logger logger = LoggerFactory.getLogger(FightLogicServiceImpl.class);
    CardServiceFacade cardService;
    @Override
    public void clean(FightOutcome fightOutcome) {
        logger.info("FightCleanUpServiceImpl cleaning up after the fight.");
        for (Monster card:fightOutcome.getMonsters()){
            cardService.discardCard(card);
            logger.info(card.toString()+ " was moved to usedDoorCardsStack");
        }
        logger.info("FightCleanUpServiceImpl finished cleaning after the fight.");

    }
}
