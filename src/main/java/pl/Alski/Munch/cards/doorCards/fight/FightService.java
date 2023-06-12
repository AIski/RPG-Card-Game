package pl.Alski.Munch.cards.doorCards.fight;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.entity.Action;
import pl.Alski.Munch.entity.Request;
import pl.Alski.Munch.cards.treasureCards.items.Item;

@Service
public interface FightService {

    Fight startFight();

    Request requestForBackup(Fight fight);

    void addPlayer(Fight fight, Character character);

    void addMonster(Fight fight, Monster monster);

    boolean projectedOutcome(Fight fight);

    boolean tryToWin(Fight fight);

    boolean tryToEscape(Fight fight, Character character);

    boolean winWithoutFight(Fight fight);

    void useExtraAction(Item item, Action action);

}
