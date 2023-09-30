package pl.Alski.Munch.logic.player.hand;

import jakarta.persistence.*;
import lombok.Data;
import pl.Alski.Munch.logic.cards.Card;

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
