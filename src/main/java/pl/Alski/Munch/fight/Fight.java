package pl.Alski.Munch.fight;

import lombok.Data;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.entity.Character;
import pl.Alski.Munch.player.Player;

import java.util.List;

@Data
public class Fight {

    private long id;
    private Player player;
    //add this one later.
//    private List<java.lang.Character> helpingCharacters;
    private List<Monster> monsters;
    private boolean isWon = false;


    public Fight(Player player, Monster monster){
        this.player = player;
        this.monsters.add(monster);
    }



}
