package pl.Alski.Munch.player;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.classes.CharacterClass;
import pl.Alski.Munch.races.Race;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;

    @OneToOne
    private Player player;

    private int level;
    private int gold;
    private Sex sex;
    private int handSize;

    @ManyToOne
    private CharacterClass characterClass;

    @ManyToOne
    private Race race;

    @OneToOne
    private Equipment equipment;
}
