package pl.Alski.Munch.cards;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public abstract class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "VISIBLE", nullable = false)
    private Boolean headsUp;

    public Card(String name) {
        this.name = name;
        this.headsUp = false;
    }
}
