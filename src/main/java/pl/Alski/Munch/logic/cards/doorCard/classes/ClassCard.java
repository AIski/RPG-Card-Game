package pl.Alski.Munch.logic.cards.doorCard.classes;

import jakarta.persistence.*;
import lombok.*;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@DiscriminatorValue("CLASS")
@NoArgsConstructor
public abstract class ClassCard extends DoorCard {
//   @Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
//   @Column(name = "id", nullable = false)
//   private Long id;

   @Enumerated(EnumType.STRING)
   private Class classEnum;

   public ClassCard(String name) {
      super(name);
   }

}
