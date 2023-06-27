package pl.Alski.Munch.curse;

import lombok.Data;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.events.Event;

@Data
public class Curse extends DoorCard {
    Event event;
    boolean isAutoCast;

    public Curse(String name, Event event) {
        super(name);
        this.event = event;
    }

    public static class CurseFactory {

        public Curse createCard(String name, Event event) {
            return new Curse(name, event);
        }
    }
}
