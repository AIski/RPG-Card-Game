package pl.Alski.Munch.items.modifiers.escape;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class EscapeBonusModifier extends EscapeModifier {
    private int modifier;
}
