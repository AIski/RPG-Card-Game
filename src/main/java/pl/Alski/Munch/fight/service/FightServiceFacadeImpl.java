package pl.Alski.Munch.fight.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.fight.EscapeOutcome;
import pl.Alski.Munch.fight.Fight;
import pl.Alski.Munch.fight.FightOutcome;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.service.EventService;

@Service
@AllArgsConstructor
public class FightServiceFacadeImpl implements FightServiceFacade {

    private final static Logger logger = LoggerFactory.getLogger(FightServiceFacadeImpl.class);
    private FightLogicService fightLogicService;
    private FightEscapeService escapeService;
    private FightPromotionService promotionService;
    private FightLootService lootService;
    private EventService eventService;
    private FightCleanUpService cleanUpService;

    @Override
    public void fight(Player player, Monster monster) {
        logger.info(player.getName() + " is about to start a fight with " + monster.toString());

        Fight fight = new Fight(player, monster);
        FightOutcome fightOutcome = fightLogicService.carryOutFight(fight);

        if (fightOutcome.isSuccess()) {
            logger.info("Promotion Service Doing its thing...");
            promotionService.promote(fightOutcome);
            logger.info("Loot Service Doing its thing...");
            lootService.distributeLoot(fightOutcome);
        } else {
            EscapeOutcome escapeOutcome = escapeService.tryToEscapeFromAllMonsters(player, fight);
            for (Monster tempMonster : escapeOutcome.getFailedToEscapeMonsters()){
                eventService.makeEventHappenToPlayer(tempMonster.getMiserableEnd(), player);
            }
        }
        cleanUpService.clean(fightOutcome);
        logger.info("The fight has ended.");
    }

}
