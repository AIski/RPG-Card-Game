package pl.Alski.Munch.fight.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.cards.service.CardServiceFacade;
import pl.Alski.Munch.fight.FightOutcome;


@Service
public class FightCleanUpServiceImpl implements FightCleanUpService{
    private final static Logger logger = LoggerFactory.getLogger(FightLogicServiceImpl.class);
    CardServiceFacade cardService;
    @Override
    public void clean(FightOutcome fightOutcome) {
        for (Monster card:fightOutcome.getMonsters()){
            cardService.discardCard(card);
            logger.info(card.toString()+ " was moved to uudDoorCardsStack");
        }
    }
}
