package pl.Alski.Munch.items.slots;

import jakarta.persistence.*;
import lombok.Data;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.items.Item;

@Entity
@Data
public class Sidekick extends TreasureCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToOne
    private Item carriedItem;
}
