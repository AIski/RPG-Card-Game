package pl.Alski.Munch.items;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.conditions.requirements.Requirement;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.events.Event;
import pl.Alski.Munch.items.modifiers.Modifier;

@Data
@NoArgsConstructor
public abstract class Item extends TreasureCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int bonus;
    private int goldWorth;
    private Requirement requirement;
    private Modifier modifier;
    private boolean isBigItem;


    public Item(String name, int bonus, int goldWorth, Requirement requirement, Modifier modifier, boolean isBigItem) {
        this.name = name;
        this.bonus = bonus;
        this.goldWorth = goldWorth;
        this.requirement = requirement;
        this.modifier = modifier;
        this.isBigItem = isBigItem;
    }
}

