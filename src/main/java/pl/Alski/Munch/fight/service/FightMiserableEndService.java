package pl.Alski.Munch.fight.service;

import pl.Alski.Munch.monster.miserableEnd.MiserableEnd;
import pl.Alski.Munch.player.Player;

public interface FightMiserableEndService {
    void faceMiserableEnd(Player player, MiserableEnd miserableEnd);
//    eventService.makeEventHappenToPlayer(tempMonster.getMiserableEnd(), player);
}
