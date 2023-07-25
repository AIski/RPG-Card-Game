package pl.Alski.Munch.items.factory;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.conditions.requirements.Requirement;
import pl.Alski.Munch.items.bonus.Bonus;
import pl.Alski.Munch.items.modifiers.Modifier;
import pl.Alski.Munch.items.slots.Boots;
import pl.Alski.Munch.items.slots.OneHandedWeapon;

@Service
public class OneHandedWeaponFactory implements ItemFactory {

    @Override
    public OneHandedWeapon createItem(String name, Bonus bonus, int goldWorth, Requirement requirement, Modifier modifier, boolean isBigItem) {
        return new OneHandedWeapon(
                name,
                bonus,
                goldWorth,
                requirement,
                modifier,
                isBigItem
        );
    }
}
