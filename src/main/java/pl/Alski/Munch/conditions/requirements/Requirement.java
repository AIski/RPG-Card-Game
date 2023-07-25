package pl.Alski.Munch.conditions.requirements;

import jakarta.persistence.*;
import lombok.Data;
import pl.Alski.Munch.conditions.Condition;
import pl.Alski.Munch.player.Character;
import pl.Alski.Munch.items.Item;

@Entity
@Data
public abstract class Requirement extends Condition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

}
