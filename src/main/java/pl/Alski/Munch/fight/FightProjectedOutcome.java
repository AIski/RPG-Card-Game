package pl.Alski.Munch.fight;

import lombok.Data;

@Data
public class FightProjectedOutcome {
    int playerScore;
    int monsterScore;
    int helpingPlayerScore;
    boolean playerShouldWin;
}
