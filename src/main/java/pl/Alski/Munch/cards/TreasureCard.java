package pl.Alski.Munch.cards;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class TreasureCard implements Card {
    private String name;

    public TreasureCard(String name) {
        this.name = name;
    }
}
