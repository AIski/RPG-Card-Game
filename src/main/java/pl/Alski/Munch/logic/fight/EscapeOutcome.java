package pl.Alski.Munch.logic.fight;

import lombok.Data;
import pl.Alski.Munch.logic.cards.doorCard.monster.Monster;

import java.util.List;

@Data
public class EscapeOutcome {
    List<Monster> escapedMonsters;

    List<Monster> failedToEscapeMonsters;

    public void escape(Monster monster) {
        escapedMonsters.add(monster);
    }

    public void fail(Monster monster) {
        failedToEscapeMonsters.add(monster);
    }
}
