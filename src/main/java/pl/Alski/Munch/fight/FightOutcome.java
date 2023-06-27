package pl.Alski.Munch.fight;

import lombok.Builder;
import lombok.Data;
import pl.Alski.Munch.monster.Monster;
import pl.Alski.Munch.player.Player;

import java.util.List;

@Data
@Builder
public class FightOutcome {
    boolean success = false;
    List<Monster> monsters;
    Player player;
    Player helpingPlayer;
}
