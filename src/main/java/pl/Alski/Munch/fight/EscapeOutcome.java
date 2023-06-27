package pl.Alski.Munch.fight;

import lombok.Data;
import pl.Alski.Munch.monster.Monster;

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
