package pl.Alski.Munch.logic.condition.requirement.requirements;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.logic.cards.doorCard.races.Race;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CannotBeRaceRequirement extends RaceRequirement {
    @Column(name="RACE")
    @Enumerated(EnumType.STRING)
    private Race race;
}
