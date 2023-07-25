package pl.Alski.Munch.conditions.requirements;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.classes.Class;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CannotBeClassRequirement extends ClassRequirement {
    @Column(name="CLASS")
    @Enumerated(EnumType.STRING)
    private Class Class;
}
