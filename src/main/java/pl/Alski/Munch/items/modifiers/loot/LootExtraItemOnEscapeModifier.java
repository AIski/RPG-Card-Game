package pl.Alski.Munch.items.modifiers.loot;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LootExtraItemOnEscapeModifier extends LootModifier {
    private int extraLootChests;

}
