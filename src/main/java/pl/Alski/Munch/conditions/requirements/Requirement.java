package pl.Alski.Munch.conditions.requirements;

import pl.Alski.Munch.conditions.Condition;
import pl.Alski.Munch.player.Character;
import pl.Alski.Munch.items.Item;

public interface Requirement extends Condition {
    boolean checkRequirement(Character character, Item item);
}
