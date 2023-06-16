package pl.Alski.Munch.cards.doorCards.fight.escape;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.fight.Fight;
import pl.Alski.Munch.player.Player;

@Service
public interface FightEscapeService {
    boolean tryToEscapeFromAllMonsters(Player player, Fight fight);
}
