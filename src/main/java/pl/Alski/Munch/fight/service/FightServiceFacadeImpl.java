package pl.Alski.Munch.fight.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.fight.EscapeOutcome;
import pl.Alski.Munch.fight.Fight;
import pl.Alski.Munch.fight.FightOutcome;
import pl.Alski.Munch.monster.Monster;
import pl.Alski.Munch.moves.PlayerMove;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.service.EventService;

import java.util.List;

@Service
@AllArgsConstructor
public class FightServiceFacadeImpl implements FightServiceFacade {

    private final static Logger logger = LoggerFactory.getLogger(FightServiceFacadeImpl.class);
    private FightLogicService fightLogicService;
    private FightEscapeService escapeService;
    private FightPromotionService promotionService;
    private FightLootService lootService;
    private FightCleanUpService cleanUpService;
    private FightSaveService saveService;
    private PlayerPossibleMovesService playerMoveService;
    private FightMiserableEndService miserableEndService;

    @Override
    public void fight(Player player, Monster monster, List<Player> spectators) {
        logger.info(player.getName() + " is about to start a fight with " + monster.toString());
        playerMoveService.setPlayerMoves(spectators, List.of(PlayerMove.DO_NOTHING));

        Fight fight = new Fight(player, monster);
        FightOutcome fightOutcome = fightLogicService.carryOutFight(fight);
        logger.info("The fight is over.");
        fight.setOver(true);
        saveService.save(fight);

        if (fightOutcome.isSuccess()) {
            logger.info(player.getName()+ " has won his fight with "+fight.getMonsters());
            logger.info("Promotion Service Doing its thing...");
            promotionService.promote(fightOutcome);
            logger.info("Loot Service Doing its thing...");
            lootService.distributeLoot(fightOutcome);
        } else {
            //todo for later: add helping player to suffer defeat too
            logger.info(player.getName() + " has lost his fight with "+fight.getMonsters());
            logger.info(player.getName() + " will try to run away from "+fight.getMonsters());
            EscapeOutcome escapeOutcome = escapeService.tryToEscapeFromAllMonsters(player, fight);
            for (Monster tempMonster : escapeOutcome.getFailedToEscapeMonsters()){
                miserableEndService.faceMiserableEnd(player, tempMonster.getMiserableEnd());
            }
        }
        cleanUpService.clean(fightOutcome);
        logger.info("The fight service job has ended.");
    }

}
