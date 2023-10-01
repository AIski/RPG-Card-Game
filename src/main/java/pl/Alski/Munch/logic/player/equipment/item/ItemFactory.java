package pl.Alski.Munch.logic.player.equipment.item;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.bonus.Bonus;
import pl.Alski.Munch.logic.cards.modifier.Modifier;
import pl.Alski.Munch.logic.condition.requirement.Requirement;

@Service
public class ItemFactory {
    public Item createItem(String name, ItemType type, Bonus bonus, int goldWorth, Requirement requirement, Modifier modifier, boolean isBigItem) {
        return Item.builder()
                .name(name)
                .itemType(type)
                .bonus(bonus)
                .goldWorth(goldWorth)
                .requirement(requirement)
                .modifier(modifier)
                .isBigItem(isBigItem)
                .build();
    }
}
