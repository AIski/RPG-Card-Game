package pl.Alski.Munch.logic.condition.requirement.requirements;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.logic.cards.doorCard.classes.Class;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class MustBeClassRequirement extends ClassRequirement {
    @Column(name="CLASS")
    @Enumerated(EnumType.STRING)
    private Class Class;
}
