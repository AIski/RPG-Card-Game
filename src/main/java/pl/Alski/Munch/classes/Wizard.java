package pl.Alski.Munch.classes;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Wizard extends CharacterClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

}
