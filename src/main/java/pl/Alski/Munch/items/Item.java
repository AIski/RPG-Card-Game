package pl.Alski.Munch.items;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.conditions.requirements.Requirement;
import pl.Alski.Munch.items.bonus.Bonus;
import pl.Alski.Munch.items.modifiers.Modifier;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="ITEM_TYPE", discriminatorType = DiscriminatorType.STRING)
@Data
@NoArgsConstructor
public abstract class Item extends TreasureCard {

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Bonus bonus;


    private String name;
    private int goldWorth;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Requirement requirement;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Modifier modifier;
    private boolean isBigItem;
    public Item(String name, Bonus bonus, int goldWorth, Requirement requirement, Modifier modifier, boolean isBigItem) {
        super(name);
        this.name=name;
        this.bonus = bonus;
        this.goldWorth = goldWorth;
        this.requirement = requirement;
        this.modifier = modifier;
        this.isBigItem = isBigItem;
    }
}

