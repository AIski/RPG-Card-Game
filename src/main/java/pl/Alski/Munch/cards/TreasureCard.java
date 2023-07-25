package pl.Alski.Munch.cards;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public abstract class TreasureCard extends Card {
    private String name;

    public TreasureCard(String name) {
        super(name);
        this.name = name;
    }
}
