package pl.Alski.Munch.logic.condition.requirement;

import jakarta.persistence.*;
import lombok.Data;
import pl.Alski.Munch.logic.condition.Condition;

@Entity
@Data
public abstract class Requirement extends Condition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

}
