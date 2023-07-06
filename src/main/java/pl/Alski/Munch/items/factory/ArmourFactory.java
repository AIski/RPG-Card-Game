package pl.Alski.Munch.items.factory;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.conditions.requirements.Requirement;
import pl.Alski.Munch.items.modifiers.Modifier;
import pl.Alski.Munch.items.slots.Armour;
import pl.Alski.Munch.items.slots.Helmet;

@Service
public class ArmourFactory implements ItemFactory {

    @Override
    public Armour createItem(String name, int bonus, int goldWorth, Requirement requirement, Modifier modifier, boolean isBigItem) {
        return new Armour(
                name,
                bonus,
                goldWorth,
                requirement,
                modifier,
                isBigItem
        );
    }
}
