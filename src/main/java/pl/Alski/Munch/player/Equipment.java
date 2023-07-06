package pl.Alski.Munch.player;

import lombok.Data;
import pl.Alski.Munch.items.slots.*;

import java.util.List;

@Data
public class Equipment {

    private OneHandedWeapon[] singleHandedWeapons= new OneHandedWeapon[2];
    private TwoHandedWeapon twoHandedWeapon;
    private Helmet helmet;
    private Armour armour;
    private Boots boots;
    private List<Other> others;
    private Sidekick sidekick;
}
