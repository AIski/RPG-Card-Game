package pl.Alski.Munch.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.player.Player;

@Service
public interface FightServiceFacade {

    void fight(Player player, Monster monster);

//    Request requestForBackup(Fight fight);
//
//    void addPlayer(Fight fight, Character character);
//
//    void addMonster(Fight fight, Monster monster);
//
//
//    boolean tryToWin(Fight fight);
//
//
//    void useExtraAction(Item item, Action action);
//
//    void removeMonsterFromTheFight(Monster monster);
}
