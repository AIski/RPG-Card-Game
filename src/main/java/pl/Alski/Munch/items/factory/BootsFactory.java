package pl.Alski.Munch.items.factory;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.conditions.requirements.Requirement;
import pl.Alski.Munch.items.modifiers.Modifier;
import pl.Alski.Munch.items.slots.Boots;
import pl.Alski.Munch.items.slots.Helmet;

@Service
public class BootsFactory implements ItemFactory {

    @Override
    public Boots createItem(String name, int bonus, int goldWorth, Requirement requirement, Modifier modifier, boolean isBigItem) {
        return new Boots(
                name,
                bonus,
                goldWorth,
                requirement,
                modifier,
                isBigItem
        );
    }
}
