package pl.Alski.Munch.logic.cards.doorCard;

import jakarta.persistence.Entity;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.logic.cards.Card;

@Entity
@NoArgsConstructor
public abstract class DoorCard extends Card {
    public DoorCard(String name) {
        super(name);
    }
}
