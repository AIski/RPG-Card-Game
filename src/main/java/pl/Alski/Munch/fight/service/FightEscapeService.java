package pl.Alski.Munch.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.fight.EscapeOutcome;
import pl.Alski.Munch.fight.Fight;
import pl.Alski.Munch.player.Player;

@Service
public interface FightEscapeService {
    EscapeOutcome tryToEscapeFromAllMonsters(Player player, Fight fight);
}
