package pl.Alski.Munch.cards.doorCards.fight.escape;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.cards.doorCards.fight.Fight;
import pl.Alski.Munch.cards.doorCards.fight.FightService;
import pl.Alski.Munch.entity.Player;
import pl.Alski.Munch.service.ConditionService;
import pl.Alski.Munch.service.DiceService;
import pl.Alski.Munch.service.EventService;
import pl.Alski.Munch.service.ModifierDiceService;

import java.util.concurrent.locks.Condition;

@Service
@AllArgsConstructor
public class FightEscapeServiceImpl implements FightEscapeService {

    private final DiceService diceService;
    private final ModifierDiceService diceModifierService;
    private final ConditionService conditionService;
    private final FightService fightService;
    private final EventService eventService;
    private final static Logger logger = LoggerFactory.getLogger(FightEscapeServiceImpl.class);

    @Override
    public boolean tryToEscapeFromAllMonsters(Player player, Fight fight) {
        logger.info(player.getName() + " trying to escape fight with" + fight.getMonsters());
        for (Monster monster: fight.getMonsters()){
            boolean result = tryToEscapeFromMonster(player, monster, fight);
            if (result) {
                logger.info(player.getName() + " successfully escaped from " + monster);
                fightService.removeMonsterFromTheFight(monster);
            }
            else{
                logger.info(player.getName() + " failed to escape from " + monster + " and is about to meet its miserable end!");
                eventService.makeEventHappenToPlayer(monster.getMiserableEnd(), player);
            }
        }
        return fight.getMonsters().isEmpty();
    }

    public boolean tryToEscapeFromMonster(Player player, Monster monster, Fight fight) {
        Condition monsterEscapeCondition = monster.getCanRunFromFightWithoutDiceThrow();
        return conditionService.checkCondition(player, monsterEscapeCondition)?
                true: rollForEscape(player, monster, fight);

    }

    private boolean rollForEscape(Player player, Monster monster, Fight fight) {
        var diceRoll = diceService.roll();
        logger.info(player.getName() + "Rolled ");
        int modifier = diceModifierService.getModifiers(fight);
        return (diceRoll + modifier) > monster.getMinimumDiceRollToEscape();
    }
}
