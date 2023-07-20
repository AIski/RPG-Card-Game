package pl.Alski.Munch.items.slots;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.conditions.requirements.Requirement;
import pl.Alski.Munch.items.Item;
import pl.Alski.Munch.items.modifiers.Modifier;

@Entity
@NoArgsConstructor
@DiscriminatorValue("ONE_HANDED_WEAPON")
public class OneHandedWeapon extends Item {
    public OneHandedWeapon(String name, int bonus, int goldWorth, Requirement requirement, Modifier modifier, boolean isBigItem) {
        super(name, bonus, goldWorth, requirement, modifier, isBigItem);
    }
}
