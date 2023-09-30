package pl.Alski.Munch.logic.fight;

import lombok.Data;
import pl.Alski.Munch.logic.cards.doorCard.monster.Monster;
import pl.Alski.Munch.logic.player.Player;

import java.util.List;

@Data
public class Fight {

    private long id;
    private Player player;
    private Player helpingPlayer;
    private List<Monster> monsters;
    private List<Player> spectators;
    private boolean isOver = false;


    public Fight(Player player, Monster monster){
        this.player = player;
        this.monsters.add(monster);
    }



}
