package pl.Alski.Munch.conditions.requirements;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.races.Race;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MustBeRaceRequirement extends RaceRequirement {

    @Column(name="RACE")
    @Enumerated(EnumType.STRING)
    private Race race;
}
