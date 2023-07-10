package pl.Alski.Munch.cards;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class DoorCard implements Card {
    private String name;

    public DoorCard(String name) {
        this.name = name;
    }

}
