package pl.Alski.Munch.logic.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.cards.doorCard.monster.Monster;
import pl.Alski.Munch.logic.player.Player;

@Service
public interface FightServiceFacade {

    void fight(Player player, Monster monster, Game game);

}
