package pl.Alski.Munch.fight;

import lombok.Data;
import pl.Alski.Munch.cards.doorCards.Monster;

import java.util.List;

@Data
public class FightOutcome {
    boolean success = false;
    List<Monster> monsters;
}
