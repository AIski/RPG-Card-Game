package pl.Alski.Munch.items.factory;

import pl.Alski.Munch.items.Item;
import pl.Alski.Munch.conditions.requirements.Requirement;

public interface ItemFactory {
    Item createItem(String name, int bonus, int goldWorth, Requirement requirement);
}
