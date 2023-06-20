package pl.Alski.Munch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.cards.doorCards.Class;
import pl.Alski.Munch.cards.treasureCards.items.Armour;
import pl.Alski.Munch.cards.treasureCards.items.Boots;
import pl.Alski.Munch.cards.treasureCards.items.Helmet;
import pl.Alski.Munch.cards.treasureCards.items.Weapon;
import pl.Alski.Munch.cards.doorCards.races.Race;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    private int level;
    private int gold;

    private int handSize;
    private Class characterClass;
    private Race race;

    private Weapon weapon;
    private Helmet helmet;
    private Armour armour;
    private Boots boots;
}
