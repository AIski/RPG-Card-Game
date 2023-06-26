package pl.Alski.Munch.cards.doorCards;

import jakarta.persistence.Entity;
import lombok.Data;
import pl.Alski.Munch.entity.Event;

@Data
public abstract class Curse extends DoorCard {
    Event event;
    boolean isAutoCast;
}
