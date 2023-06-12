package pl.Alski.Munch.cards.doorCards.fight;

import lombok.Data;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.character.Character;

import java.util.List;

@Data
public class Fight {


    private long id;
    private Character character;
    private List<java.lang.Character> helpingCharacters;
    private List<Monster> monsters;



    public Fight(Character character, Monster monster){
        this.character = character;
        this.monsters.add(monster);
    }
    public Fight(Character character, Monster firstMonster, Monster secondMonster){
        this(character, firstMonster);
        this.monsters.add(secondMonster);
    }

    public Fight(Character character, Monster firstMonster, Monster secondMonster, Monster thirdMonster){
        this(character, firstMonster, secondMonster);
        this.monsters.add(thirdMonster);
    }


}
