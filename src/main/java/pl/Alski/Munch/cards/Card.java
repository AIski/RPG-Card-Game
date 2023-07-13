package pl.Alski.Munch.cards;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public abstract class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private Boolean headsUp;
}
