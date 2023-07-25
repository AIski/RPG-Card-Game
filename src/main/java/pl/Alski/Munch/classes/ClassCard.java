package pl.Alski.Munch.classes;

import jakarta.persistence.*;
import lombok.Data;
import pl.Alski.Munch.cards.DoorCard;

@Data
@Entity
@DiscriminatorValue("CLASS")
public abstract class ClassCard extends DoorCard {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private Long id;

   @Enumerated(EnumType.STRING)
   private Class classEnum;

}
