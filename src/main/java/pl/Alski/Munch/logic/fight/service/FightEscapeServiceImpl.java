package pl.Alski.Munch.logic.fight.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.condition.Condition;
import pl.Alski.Munch.logic.cards.doorCard.monster.Monster;
import pl.Alski.Munch.logic.fight.EscapeOutcome;
import pl.Alski.Munch.logic.fight.Fight;
import pl.Alski.Munch.logic.player.Player;
import pl.Alski.Munch.logic.condition.service.ConditionService;
import pl.Alski.Munch.logic.dice.DiceService;
import pl.Alski.Munch.logic.cards.modifier.modifiers.dice.ModifierDiceService;


@Service
@AllArgsConstructor
public class FightEscapeServiceImpl implements FightEscapeService {

    private final DiceService diceService;
    private final ModifierDiceService diceModifierService;
    private final ConditionService conditionService;
    private final static Logger logger = LoggerFactory.getLogger(FightEscapeServiceImpl.class);

    @Override
    public EscapeOutcome tryToEscapeFromAllMonsters(Player player, Fight fight) {
        logger.info(player.getName() + " trying to escape fight with" + fight.getMonsters());
        EscapeOutcome escapeOutcome = new EscapeOutcome();
        for (Monster monster : fight.getMonsters()) {
            if (tryToEscapeFromMonster(player, monster, fight)) {
                logger.info(player.getName() + " successfully escaped from " + monster);
                escapeOutcome.escape(monster);
            } else {
                escapeOutcome.fail(monster);
                logger.info(player.getName() + " failed to escape from " + monster + " and is about to meet its miserable end!");
            }
        }
        return escapeOutcome;
    }


    public boolean tryToEscapeFromMonster(Player player, Monster monster, Fight fight) {
        Condition monsterEscapeCondition = monster.getEscapeWithoutFightCondition();
        boolean canEscapeWithoutRoll = conditionService.checkCondition(player, monsterEscapeCondition);
        return canEscapeWithoutRoll? true : rollForEscape(player, monster, fight);
    }

    private boolean rollForEscape(Player player, Monster monster, Fight fight) {
        int escapeModifier = diceModifierService.getModifiers(fight);
        int minimumEscapeRoll = 5 - escapeModifier;
        logger.info(player.getName() + " has to roll at least " + minimumEscapeRoll);
        var diceRoll = diceService.roll();
        logger.info(player.getName() + " rolled " + diceRoll);
        return diceRoll > minimumEscapeRoll;
    }
}
