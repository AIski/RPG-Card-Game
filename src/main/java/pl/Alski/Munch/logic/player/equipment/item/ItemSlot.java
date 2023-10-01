package pl.Alski.Munch.logic.player.equipment.item;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ITEM_SLOT")
@Getter
@Setter
@RequiredArgsConstructor
public class ItemSlot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "ITEM_TYPE")
    @Enumerated(value = EnumType.STRING)
    private final ItemType requiredType;

    @OneToOne
    @JoinColumn(name="ITEM_ID")
    private Item item;
}
