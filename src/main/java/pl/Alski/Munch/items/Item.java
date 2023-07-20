package pl.Alski.Munch.items;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.conditions.requirements.Requirement;
import pl.Alski.Munch.items.modifiers.Modifier;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="ITEM_TYPE", discriminatorType = DiscriminatorType.STRING)
@Data
@NoArgsConstructor
public abstract class Item extends TreasureCard {

    private int bonus;
    private int goldWorth;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Requirement requirement;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Modifier modifier;
    private boolean isBigItem;
    public Item(String name, int bonus, int goldWorth, Requirement requirement, Modifier modifier, boolean isBigItem) {
        super(name);
        this.bonus = bonus;
        this.goldWorth = goldWorth;
        this.requirement = requirement;
        this.modifier = modifier;
        this.isBigItem = isBigItem;
    }
}

