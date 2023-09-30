package pl.Alski.Munch.logic.bonus;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("SIMPLE_BONUS")
public class SimpleBonus extends Bonus{
    @Column(name="BASE_VALUE")
    private int value;
}
