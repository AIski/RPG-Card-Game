package pl.Alski.Munch.races;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public abstract class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String raceName;
//    public abstract void performSpecialAbility();
}
