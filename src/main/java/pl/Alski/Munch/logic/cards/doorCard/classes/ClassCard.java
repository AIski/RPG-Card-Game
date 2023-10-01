package pl.Alski.Munch.logic.cards.doorCard.classes;

import jakarta.persistence.*;
import lombok.*;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;

@Entity
@Getter
@Setter
@Table(name="CLASS_CARD")
@NoArgsConstructor
public class ClassCard extends DoorCard {

   @Enumerated(EnumType.STRING)
   @Column(name="CLASS_NAME")
   private Class classEnum;

   public ClassCard(String name) {
      super(name);
   }

}
