package pl.Alski.Munch.logic.cards.doorCard.curse;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;
import pl.Alski.Munch.logic.events.Event;

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
