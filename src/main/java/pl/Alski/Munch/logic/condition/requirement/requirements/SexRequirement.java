package pl.Alski.Munch.logic.condition.requirement.requirements;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.logic.condition.requirement.Requirement;
import pl.Alski.Munch.logic.player.Sex;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SexRequirement extends Requirement {
    @Column(name="SEX")
    @Enumerated(EnumType.STRING)
    private Sex requiredSex;
}
