package pl.Alski.Munch.monster;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.conditions.Condition;
import pl.Alski.Munch.monster.miserableEnd.MiserableEnd;

import java.lang.reflect.Modifier;
import java.util.List;

@Data
@NoArgsConstructor
public class Monster extends DoorCard {
    private int level;
    private List<Modifier> modifiers;
    private MiserableEnd miserableEnd;
    private int lootSize;
    private int levelsGranted = 1;
    private Condition escapeWithoutFightCondition;

    public Monster(String name) {
        super(name);
    }


}
