package pl.Alski.Munch.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.player.Player;

import java.util.List;

@Service
public interface FightServiceFacade {

    void fight(Player player, Monster monster, List<Player> spectators);

}
