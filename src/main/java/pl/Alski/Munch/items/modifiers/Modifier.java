package pl.Alski.Munch.items.modifiers;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public abstract class Modifier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

}
