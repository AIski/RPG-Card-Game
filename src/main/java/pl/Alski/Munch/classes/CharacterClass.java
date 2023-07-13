package pl.Alski.Munch.classes;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public abstract class CharacterClass {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "id", nullable = false)
   private Long id;

   private String className;

}
