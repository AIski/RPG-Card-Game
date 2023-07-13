package pl.Alski.Munch.curse;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.events.Event;

@Data
@NoArgsConstructor
public class Curse extends DoorCard {
    Event event;
    boolean isAutoCast;


    public Curse(Event event) {
        this.event = event;
    }

    public static class CurseFactory {
        public Curse createCard(String name, Event event) {
            return new Curse(event);
        }
    }
}
