package pl.Alski.Munch.conditions.requirements;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CannotBeRaceRequirement extends RaceRequirement {
    private String raceName;
}
