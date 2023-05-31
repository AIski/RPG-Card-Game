package pl.Alski.Munch.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.items.Armour;
import pl.Alski.Munch.items.Boots;
import pl.Alski.Munch.items.Helmet;
import pl.Alski.Munch.items.Weapon;
import pl.Alski.Munch.races.Race;


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
