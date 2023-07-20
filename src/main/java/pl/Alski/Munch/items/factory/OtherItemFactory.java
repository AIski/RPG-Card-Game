package pl.Alski.Munch.items.factory;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.conditions.requirements.Requirement;
import pl.Alski.Munch.items.modifiers.Modifier;
import pl.Alski.Munch.items.slots.Other;
import pl.Alski.Munch.items.slots.TwoHandedWeapon;

@Service
public class OtherItemFactory implements ItemFactory {

    @Override
    public Other createItem(String name, int bonus, int goldWorth, Requirement requirement, Modifier modifier, boolean isBigItem) {
        return new Other(
                name,
                bonus,
                goldWorth,
                requirement,
                modifier,
                isBigItem
        );
    }
}
