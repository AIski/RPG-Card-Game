package pl.Alski.Munch.logic.cards.doorCard.monster;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;
import pl.Alski.Munch.logic.cards.doorCard.monster.miserableEnd.MiserableEnd;
import pl.Alski.Munch.logic.condition.Condition;

import java.lang.reflect.Modifier;
import java.util.List;

@Data
@Table(name="MONSTERS")
@NoArgsConstructor
@DiscriminatorValue("MONSTER")
public class Monster extends DoorCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private int level;
    private List<Modifier> modifiers;
    private MiserableEnd miserableEnd;
    private int lootSize;
    private int levelsGranted = 1;
    private Condition escapeWithoutFightCondition;
}
