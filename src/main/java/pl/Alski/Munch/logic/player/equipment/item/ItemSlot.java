package pl.Alski.Munch.logic.player.equipment.item;

import lombok.AllArgsConstructor;



@AllArgsConstructor
public class ItemSlot {
    private final ItemType requiredType;
    private Item item;

    public ItemSlot(ItemType requiredType) {
        this.requiredType = requiredType;
    }
}
