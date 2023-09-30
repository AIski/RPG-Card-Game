package pl.Alski.Munch.logic.fight;

import lombok.Data;

@Data
public class FightProjectedOutcome {
    int playerScore;
    int monsterScore;
    int helpingPlayerScore;
    boolean playerShouldWin;
}
