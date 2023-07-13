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
    private TwoHandedWeapon twoHandedWeapon;

    @OneToOne
    private Helmet helmet;

    @OneToOne
    private Armour armour;

    @OneToOne
    private Boots boots;

    @OneToMany
    private List<Other> others;
    
    @OneToOne
    private Sidekick sidekick;
}
