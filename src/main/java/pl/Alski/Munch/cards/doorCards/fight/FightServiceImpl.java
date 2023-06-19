package pl.Alski.Munch.cards.doorCards.fight;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.cards.treasureCards.items.Item;
import pl.Alski.Munch.entity.Action;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.entity.Request;

@Service
public class FightServiceImpl implements FightService {
    @Override
    public Fight startFight(Player player, Monster monster) {

        /// TODO: // HERE comes the fight code. result is the outcome of the fight.
        // TODO: WE need to rework this, use sub-services to do everything inside this service including:
        // TODO: Fight logic + player moves
        // TODO: - promotion service
        // TODO: - escape service
        // TODO: - loot service.

            Fight fight = fightService.startFight(currentPlayer, monster);
            if (fight.isWon()) {
                //check player is eligible for promotion
                // if so, promote him
                //check player is eligible for loot, if so, call the loot

                // TODO

                cardService.discardCard(monster);
            } else {
                boolean escapeResult = escapeService.tryToEscapeFromAllMonsters(currentPlayer, fight);
                if (escapeResult) {
                    cardService.discardCard(monster);
                }
                //TODO: THIS CODE
                //            // if you escape, you dont get loot or level
                //            // if you fail to escape, you face the monster miserable end.
            }


        }

    @Override
    public Request requestForBackup(Fight fight) {
        return null;
    }

    @Override
    public void addPlayer(Fight fight, Character character) {

    }

    @Override
    public void addMonster(Fight fight, Monster monster) {

    }

    @Override
    public boolean projectedOutcome(Fight fight) {
        return false;
    }

    @Override
    public boolean tryToWin(Fight fight) {
        return false;
    }

    @Override
    public boolean tryToEscape(Fight fight, Character character) {
        return false;
    }

    @Override
    public boolean winWithoutFight(Fight fight) {
        return false;
    }

    @Override
    public void useExtraAction(Item item, Action action) {

    }

    @Override
    public void removeMonsterFromTheFight(Monster monster) {

    }
}
