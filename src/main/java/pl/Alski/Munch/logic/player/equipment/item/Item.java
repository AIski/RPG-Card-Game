package pl.Alski.Munch.logic.player.equipment.item;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.logic.bonus.Bonus;
import pl.Alski.Munch.logic.cards.modifier.Modifier;
import pl.Alski.Munch.logic.cards.treasureCard.TreasureCard;
import pl.Alski.Munch.logic.condition.requirement.Requirement;

@Entity
@Table(name = "ITEM")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Item extends TreasureCard {

    @Enumerated(value = EnumType.STRING)
    @Column(name = "ITEM_TYPE")
    private ItemType itemType;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Bonus bonus;

    @Column(name = "GOLD_WORTH")
    private int goldWorth;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Requirement requirement;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Modifier modifier;

    @Column(name = "IS_BIG_ITEM")
    private boolean isBigItem;

    @Builder
    public Item(String name, ItemType itemType, Bonus bonus,
                int goldWorth, Requirement requirement,
                Modifier modifier, boolean isBigItem) {
        super(name);
        this.itemType = itemType;
        this.bonus = bonus;
        this.goldWorth = goldWorth;
        this.requirement = requirement;
        this.modifier = modifier;
        this.isBigItem = isBigItem;
    }

}

