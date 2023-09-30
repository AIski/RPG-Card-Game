package pl.Alski.Munch.logic.bonus;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.logic.condition.requirement.Requirement;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("CONDITIONED_BONUS")
public class ConditionedBonus extends Bonus {
    @Column(name="BASE_VALUE")
    private int baseValue;
    @Column(name="CONDITION_MET_VALUE")
    private int conditionMetValue;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Requirement requirement;

}
