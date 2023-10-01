package pl.Alski.Munch.logic.cards.doorCard.races;

import jakarta.persistence.*;
import lombok.*;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="RACE")
public abstract class RaceCard extends DoorCard {

    @Enumerated(EnumType.STRING)
    @Column(name="RACE")
    private Race race;

    public RaceCard(String name) {
        super(name);
    }


}
