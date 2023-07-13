package pl.Alski.Munch.items.slots;

import jakarta.persistence.*;
import lombok.Data;
import pl.Alski.Munch.items.Item;

@Entity
@Data
public class Boots extends Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
}
