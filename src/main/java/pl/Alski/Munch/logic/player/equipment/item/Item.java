package pl.Alski.Munch.logic.player.equipment.item;

import jakarta.persistence.*;
import lombok.*;
import pl.Alski.Munch.logic.bonus.Bonus;
import pl.Alski.Munch.logic.cards.modifier.modifiers.Modifier;
import pl.Alski.Munch.logic.cards.treasureCard.TreasureCard;
import pl.Alski.Munch.logic.condition.requirement.Requirement;

@Entity
//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name="ITEM_TYPE", discriminatorType = DiscriminatorType.STRING)
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Item extends TreasureCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;

    @Enumerated(value = EnumType.STRING)
    private ItemType itemType;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Bonus bonus;


    private int goldWorth;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Requirement requirement;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Modifier modifier;
    private boolean isBigItem;


    public void setId(Long id) {
        this.id = id;
    }


//    public Item(String name, Bonus bonus, int goldWorth, Requirement requirement, Modifier modifier, boolean isBigItem) {
//        super(name);
//        this.name=name;
//        this.bonus = bonus;
//        this.goldWorth = goldWorth;
//        this.requirement = requirement;
//        this.modifier = modifier;
//        this.isBigItem = isBigItem;
//    }
}

