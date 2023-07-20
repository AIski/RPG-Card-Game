package pl.Alski.Munch.player;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.classes.ClassCard;
import pl.Alski.Munch.races.RaceCard;

@Entity
@Table(name = "CHARACTERS")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;
    private String name;

    @OneToOne
    private Player player;

    private int level;
    private int gold;

    @Enumerated(EnumType.STRING)
    private Sex sex;
    private int handSize;

    @ManyToOne
    private ClassCard characterClass;

    @ManyToOne
    private RaceCard raceCard;

    @OneToOne
    private Equipment equipment;
}
