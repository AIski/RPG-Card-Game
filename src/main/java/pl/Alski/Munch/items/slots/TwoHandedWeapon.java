package pl.Alski.Munch.items.slots;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.conditions.requirements.Requirement;
import pl.Alski.Munch.items.Item;
import pl.Alski.Munch.items.modifiers.Modifier;

@Entity
@Data
@NoArgsConstructor
@DiscriminatorValue("TWO_HANDED_WEAPON")
public class TwoHandedWeapon extends Item {
    public TwoHandedWeapon(String name, int bonus, int goldWorth, Requirement requirement, Modifier modifier, boolean isBigItem) {
        super(name, bonus, goldWorth, requirement, modifier, isBigItem);
    }

}
