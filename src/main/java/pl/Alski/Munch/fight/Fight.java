package pl.Alski.Munch.fight;

import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.entity.Character;

import java.util.List;


public class Fight {


    private long id;
    private Character character;
    private List<java.lang.Character> helpingCharacters;
    private Monster monster;
    private List<Monster> helpingMonsters;
    private boolean canWinWithoutFight;


    public Fight(Character character, Monster monster){
        this.character = character;
        this.monster = monster;
    }
    public Fight(Character character, Monster firstMonster, Monster secondMonster){
        this(character, firstMonster);
        this.helpingMonsters.add(secondMonster);
    }

    public Fight(Character character, Monster firstMonster, Monster secondMonster, Monster thirdMonster){
        this(character, firstMonster, secondMonster);
        this.helpingMonsters.add(thirdMonster);
    }


}
