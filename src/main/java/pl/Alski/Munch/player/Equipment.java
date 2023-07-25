package pl.Alski.Munch.player;

import jakarta.persistence.*;
import lombok.Data;
import pl.Alski.Munch.items.slots.*;

import java.util.List;

@Data
@Entity
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany
    private OneHandedWeapon[] singleHandedWeapons = new OneHandedWeapon[2];

    @OneToOne
    @JoinColumn(name = "TWO_HANDED_WEAPON_ID")
    private TwoHandedWeapon twoHandedWeapon;

    @OneToOne
    @JoinColumn(name = "HELMET_ID")
    private Helmet helmet;

    @OneToOne
    @JoinColumn(name = "ARMOUR_ID")
    private Armour armour;

    @OneToOne
    @JoinColumn(name = "BOOTS_ID")
    private Boots boots;

    @OneToMany
    @JoinColumn(name = "OTHERS_ID")
    private List<Other> others;
    
    @OneToOne
    @JoinColumn(name = "SIDEKICK_ID")
    private Sidekick sidekick;
}
