package pl.Alski.Munch.items.slots;

import pl.Alski.Munch.conditions.requirements.Requirement;
import pl.Alski.Munch.items.Item;
import pl.Alski.Munch.items.modifiers.Modifier;

public class Helmet extends Item {
    public Helmet(String name, int bonus, int goldWorth, Requirement requirement, Modifier modifier, boolean isBigItem) {
        super(name, bonus, goldWorth, requirement, modifier, isBigItem);
    }
}
