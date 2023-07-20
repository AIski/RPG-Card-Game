package pl.Alski.Munch.items.slots;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.conditions.requirements.Requirement;
import pl.Alski.Munch.items.Item;
import pl.Alski.Munch.items.modifiers.Modifier;

@Entity
@Data
@NoArgsConstructor
@DiscriminatorValue("SIDEKICK")
public class Sidekick extends TreasureCard {
    public Sidekick(String name) {
        super(name);
    }
    @OneToOne
    private Item carriedItem;
}
