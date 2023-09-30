package pl.Alski.Munch.logic.player.character;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.logic.cards.doorCard.classes.ClassCard;
import pl.Alski.Munch.logic.cards.doorCard.races.RaceCard;
import pl.Alski.Munch.logic.player.equipment.Equipment;
import pl.Alski.Munch.logic.player.Player;
import pl.Alski.Munch.logic.player.Sex;

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

    @Column(name = "NAME", nullable = false)
    private String name;

    @OneToOne
    private Player player;

    @Column(name = "LEVEL", nullable = false)
    private int level;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEX", nullable = false)
    private Sex sex;

    @Column(name = "HAND_SIZE", nullable = false)
    private int handSize;

    @OneToOne
    @JoinColumn(name = "CLASS_ID")
    private ClassCard characterClass;

    @OneToOne
    @JoinColumn(name = "RACE_ID")
    private RaceCard raceCard;

    @OneToOne
    @JoinColumn(name="EQUIPMENT_ID")
    private Equipment equipment;
}
