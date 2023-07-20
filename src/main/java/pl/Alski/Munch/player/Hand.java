package pl.Alski.Munch.player;

import jakarta.persistence.*;
import lombok.Data;
import pl.Alski.Munch.cards.Card;

import java.util.List;

@Entity
@Data
public class Hand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToMany
    private List<Card> cards;

}
