package pl.Alski.Munch.monster;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.conditions.Condition;
import pl.Alski.Munch.events.Event;

import java.lang.reflect.Modifier;
import java.util.List;

@Data
@NoArgsConstructor
public class Monster extends DoorCard {
    private int level;
    private List<Modifier> modifiers;
    private Event miserableEnd;
    private int lootSize;
    private int levelsGranted = 1;
    private Condition escapeWithoutFightCondition;

    //    private Condition canRunFromFightWithoutDiceThrow;
//    private boolean canUseHelpToFightIt = true;
    //    private int minimumDiceRollToEscape = 5;
    public Monster(String name) {
        super(name);
    }


}
