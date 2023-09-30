package pl.Alski.Munch.logic.fight.service;

import pl.Alski.Munch.logic.cards.doorCard.monster.miserableEnd.MiserableEnd;
import pl.Alski.Munch.logic.player.Player;

public interface FightMiserableEndService {
    void faceMiserableEnd(Player player, MiserableEnd miserableEnd);
//    eventService.makeEventHappenToPlayer(tempMonster.getMiserableEnd(), player);
}
