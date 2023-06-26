package pl.Alski.Munch.player;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.player.items.*;
import pl.Alski.Munch.player.items.slots.*;

import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    @OneToOne
    @JoinColumn(name = "player_id")
    private Player player;

    private int level;
    private int gold;
    private Sex sex;

    private int handSize;
    private Class characterClass;
    private Race race;

    private Weapon weapon;
    private Helmet helmet;
    private Armour armour;
    private Boots boots;
    private List<Other> others;

    private BigItem bigItem;
}
