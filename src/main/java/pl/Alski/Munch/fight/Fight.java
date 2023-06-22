package pl.Alski.Munch.fight;

import lombok.Data;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.player.Player;

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
