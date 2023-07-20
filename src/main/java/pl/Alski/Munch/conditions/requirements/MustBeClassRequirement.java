package pl.Alski.Munch.conditions.requirements;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MustBeClassRequirement extends ClassRequirement {
    private String className;
}
