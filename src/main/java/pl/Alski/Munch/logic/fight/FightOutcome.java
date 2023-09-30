package pl.Alski.Munch.logic.fight;

import lombok.Builder;
import lombok.Data;
import pl.Alski.Munch.logic.cards.doorCard.monster.Monster;
import pl.Alski.Munch.logic.player.Player;

import java.util.List;

@Data
@Builder
public class FightOutcome {
    boolean success = false;
    List<Monster> monsters;
    Player player;
    Player helpingPlayer;
}
