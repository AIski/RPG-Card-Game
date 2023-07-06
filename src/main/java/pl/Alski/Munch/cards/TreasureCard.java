package pl.Alski.Munch.cards;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class TreasureCard implements Card {
    private String name;

    public TreasureCard(String name) {
        this.name = name;
    }
}
