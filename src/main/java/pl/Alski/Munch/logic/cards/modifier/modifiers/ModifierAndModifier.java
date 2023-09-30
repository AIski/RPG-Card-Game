package pl.Alski.Munch.logic.cards.modifier.modifiers;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ModifierAndModifier extends Modifier{
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "FIRST_MODIFIER_ID")
    private Modifier firstModifier;
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "SECOND_MODIFIER_ID")
    private Modifier secondModifier;
}
