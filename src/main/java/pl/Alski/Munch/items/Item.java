package pl.Alski.Munch.items;

import lombok.Data;
import pl.Alski.Munch.conditions.requirements.Requirement;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.events.Event;
import pl.Alski.Munch.items.modifiers.Modifier;

@Data
public abstract class Item extends TreasureCard {
    private int bonus;
    private int goldWorth;
    private String name;
    private Requirement requirement;
    private Modifier modifier;
    private Event onThrowAwayItemSkill;
}

