package pl.Alski.Munch.monster;

public class MonsterFactory {
    public Monster createCard(String name) {
        return new Monster(name);
    }

}
