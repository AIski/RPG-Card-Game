package pl.Alski.Munch.races;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.cards.DoorCard;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@DiscriminatorValue("RACE")
public abstract class RaceCard extends DoorCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name="RACE")
    @Enumerated(EnumType.STRING)
    private Race race;


}
