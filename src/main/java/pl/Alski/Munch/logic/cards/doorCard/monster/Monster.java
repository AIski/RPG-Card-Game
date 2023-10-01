package pl.Alski.Munch.logic.cards.doorCard.monster;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;
import pl.Alski.Munch.logic.cards.doorCard.monster.miserableEnd.MiserableEnd;
import pl.Alski.Munch.logic.condition.Condition;

import java.lang.reflect.Modifier;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name="MONSTER")
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
