package pl.Alski.Munch.cards.doorCards;

import lombok.Data;
import pl.Alski.Munch.entity.Event;

import java.lang.reflect.Modifier;
import java.util.concurrent.locks.Condition;

@Data
public class Monster extends DoorCard {
    private int level;
    private int minimumDiceRollToEscape = 5;
    private Event miserableEnd;
    private int numberOfLootChests;
    private boolean canUseHelpToFightIt = true;
    private Modifier modifier;
    private Condition canRunFromFightWithoutDiceThrow;
}
