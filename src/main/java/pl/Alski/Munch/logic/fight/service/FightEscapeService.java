package pl.Alski.Munch.logic.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.fight.EscapeOutcome;
import pl.Alski.Munch.logic.fight.Fight;
import pl.Alski.Munch.logic.player.Player;

@Service
public interface FightEscapeService {
    EscapeOutcome tryToEscapeFromAllMonsters(Player player, Fight fight);
}
