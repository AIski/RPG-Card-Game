package pl.Alski.Munch.conditions.requirements;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.player.Sex;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SexRequirement extends Requirement {
    @Column(name="SEX")
    @Enumerated(EnumType.STRING)
    private Sex requiredSex;
}
