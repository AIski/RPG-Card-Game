package pl.Alski.Munch.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.entity.Items.Armour;
import pl.Alski.Munch.entity.Items.Boots;
import pl.Alski.Munch.entity.Items.Helmet;
import pl.Alski.Munch.entity.Items.Weapon;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Character {

    private int level;
    private int gold;
    private int handSize;
    private Class characterClass;
    private Weapon weapon;
    private Helmet helmet;
    private Armour armour;
    private Boots boots;
}
