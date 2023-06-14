package pl.Alski.Munch.cards.doorCards.fight;

import lombok.Data;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.character.Character;

import java.util.List;

@Data
public class Fight {

    private long id;
    private Character character;
    //add this one later.
//    private List<java.lang.Character> helpingCharacters;
    private List<Monster> monsters;
    private boolean isWon = false;


    public Fight(Character character, Monster monster){
        this.character = character;
        this.monsters.add(monster);
    }



}
