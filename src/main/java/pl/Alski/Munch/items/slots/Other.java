package pl.Alski.Munch.items.slots;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.conditions.requirements.Requirement;
import pl.Alski.Munch.items.Item;
import pl.Alski.Munch.items.bonus.Bonus;
import pl.Alski.Munch.items.modifiers.Modifier;


@Entity
@NoArgsConstructor
@DiscriminatorValue("OTHER")
public class Other extends Item {
    public Other(String name, Bonus bonus, int goldWorth, Requirement requirement, Modifier modifier, boolean isBigItem) {
        super(name, bonus, goldWorth, requirement, modifier, isBigItem);
    }
}
