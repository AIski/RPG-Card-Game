package pl.Alski.Munch.fight.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.fight.Fight;
import pl.Alski.Munch.fight.FightOutcome;
import pl.Alski.Munch.service.ModifierService;
import pl.Alski.Munch.service.PlayerCommunicationService;

@Service
@AllArgsConstructor
public class FightLogicServiceImpl implements FightLogicService {
    private final static Logger logger = LoggerFactory.getLogger(FightLogicServiceImpl.class);
    private FightProjectedOutcomeService projectedOutcomeService;
    private FightBackupService backupService;
    private ModifierService modifierService;
    private PlayerCommunicationService communicationService;


    @Override
    public FightOutcome carryOutFight(Fight fight) {
        var player = fight.getPlayer();

        /// TODO: // HERE comes the fight code. result is the outcome of the fight.
        //  - Fight logic
        //  - player moves
        //          -- use items,
        //          -- request backup - this one for later.


        // check if the player can win solo

        // if not, check if he can use some items or consumables to win.
        communicationService.askPlayer(player, "Looks like you are about to lose that fight. Got any items you can use?");
        //use items he wanted to use, recalculate the battle outcome


        // if he still loses, he can ask for help
        //TODO: For later:
        // - // ask the otherPlayer if he wants to help
        //        //pretty much if anyone says no, you ask every player until someone helps you or everyone says no
        // - try to bribe other players if you have to. You can offer any of your items or any share in Monster Treasures;
        return null;
    }

    //boolean projectedResult = projectedOutcomeService.checkIfPlayerWinsTheFight(fight);
    //               if (projectedResult){
    //                    logger.info(player.getName() + " is about to win the Fight with " + monster.toString()+ ". Anyone willing to change it?");
    //               }
}
