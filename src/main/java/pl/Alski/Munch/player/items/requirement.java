package pl.Alski.Munch.player.items;

import pl.Alski.Munch.player.Character;

public interface requirement {
    boolean checkRequirement(Character character, Item item);
}
