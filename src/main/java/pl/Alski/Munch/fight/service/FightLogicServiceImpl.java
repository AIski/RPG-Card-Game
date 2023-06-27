package pl.Alski.Munch.fight.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.fight.Fight;
import pl.Alski.Munch.fight.FightOutcome;
import pl.Alski.Munch.fight.FightProjectedOutcome;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.moves.PlayerMove;
import pl.Alski.Munch.service.PlayerCommunicationService;

import java.util.ArrayList;
import java.util.Optional;

@Service
@AllArgsConstructor
public class FightLogicServiceImpl implements FightLogicService {
    private final static Logger logger = LoggerFactory.getLogger(FightLogicServiceImpl.class);
    private FightProjectedOutcomeService projectedOutcomeService;
    private PlayerCommunicationService communicationService;
    private FightSaveService saveService;


    @Override
    public FightOutcome carryOutFight(Fight fight) {
        logger.info("Inside FightLogicServiceImpl");
        FightProjectedOutcome projectedOutcome;
        while (!fight.isOver()) {
            logger.info("Inside fight loop of FightLogicService");
            projectedOutcome = projectedOutcomeService.getFightProjectedOutcome(fight);
            communicationService.sendProjectedOutcome(projectedOutcome);
            setPlayerMoves(fight);
            setOtherPlayersMoves(fight);
            saveService.save(fight);
        }
       projectedOutcome = projectedOutcomeService.getFightProjectedOutcome(fight);
        logger.info("FightLogicServiceImpl finishing its job.");
        return FightOutcome.builder()
                .player(fight.getPlayer())
                .helpingPlayer(Optional.ofNullable(fight.getHelpingPlayer()).orElse(null))
                .success(projectedOutcome.isPlayerShouldWin())
                .monsters(fight.getMonsters())
                .build();
    }


    private static void setPlayerMoves(Fight fight) {
        var player = fight.getPlayer();
        var possibleMoves = new ArrayList<PlayerMove>();
        possibleMoves.add(PlayerMove.ACCEPT_THE_OUTCOME);
        possibleMoves.add(PlayerMove.USE_CARD);
        if (fight.getHelpingPlayer() != null) possibleMoves.add(PlayerMove.ASK_FOR_HELP);
        player.setPlayerMoves(possibleMoves);
    }

    private void setOtherPlayersMoves(Fight fight) {
        var possibleMoves = new ArrayList<PlayerMove>();
        possibleMoves.add(PlayerMove.USE_CARD);

        var helpingPlayer = fight.getHelpingPlayer();
        helpingPlayer.setPlayerMoves(possibleMoves);
        for (Player spectator : fight.getSpectators()) {
            spectator.setPlayerMoves(possibleMoves);
        }

    }


}
