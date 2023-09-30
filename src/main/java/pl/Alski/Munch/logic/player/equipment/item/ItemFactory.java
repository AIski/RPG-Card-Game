package pl.Alski.Munch.logic.player.equipment.item;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.modifier.modifiers.Modifier;
import pl.Alski.Munch.logic.player.equipment.item.Item;
import pl.Alski.Munch.logic.condition.requirement.Requirement;
import pl.Alski.Munch.logic.bonus.Bonus;

import static pl.Alski.Munch.logic.player.equipment.item.Item.*;

@Service
public class ItemFactory {
   public Item createItem(String name, ItemType type, Bonus bonus, int goldWorth, Requirement requirement, Modifier modifier, boolean isBigItem) {
        Item newItem =  Item.builder()
                name(name),
                type,
                bonus,
                goldWorth,
                requirement,
                modifier,
                isBigItem;
}
