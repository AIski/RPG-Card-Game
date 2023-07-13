package pl.Alski.Munch.cards;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name="treasure_cards")
@NoArgsConstructor
public abstract class TreasureCard extends Card {

}
