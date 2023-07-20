package pl.Alski.Munch.conditions.requirements;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.player.Sex;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SexRequirement extends Requirement {
    private Sex requiredSex;
}
