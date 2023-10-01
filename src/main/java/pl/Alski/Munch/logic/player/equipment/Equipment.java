package pl.Alski.Munch.logic.player.equipment;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import pl.Alski.Munch.logic.player.equipment.item.ItemSlot;
import pl.Alski.Munch.logic.player.equipment.item.ItemType;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Table(name="EQUIPMENT")
@Entity
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @OneToMany
    @JoinTable(name = "EQUIPMENT_ITEM_SLOT",
            joinColumns = @JoinColumn(name = "EQUIPMENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITEM_SLOT_ID")
    )
    private List<ItemSlot> itemSlots;

    public Equipment() {
        List<ItemSlot> itemSlots = new ArrayList<>();
        itemSlots.add(new ItemSlot(ItemType.ARMOUR));
        itemSlots.add(new ItemSlot(ItemType.BOOTS));
        itemSlots.add(new ItemSlot(ItemType.HELMET));
        itemSlots.add(new ItemSlot(ItemType.ONE_HANDED_WEAPON));
        itemSlots.add(new ItemSlot(ItemType.ONE_HANDED_WEAPON));
        itemSlots.add(new ItemSlot(ItemType.OTHER));
        itemSlots.add(new ItemSlot(ItemType.OTHER));
        itemSlots.add(new ItemSlot(ItemType.OTHER));
        itemSlots.add(new ItemSlot(ItemType.OTHER));
        itemSlots.add(new ItemSlot(ItemType.OTHER));
        itemSlots.add(new ItemSlot(ItemType.SIDEKICK));
        itemSlots.add(new ItemSlot(ItemType.TWO_HANDED_WEAPON));
        this.itemSlots = itemSlots;
    }

}
