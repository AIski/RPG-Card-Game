package pl.Alski.Munch.logic.message;

import jakarta.persistence.*;
import lombok.Data;
import pl.Alski.Munch.logic.player.Player;

@Entity
@Data
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String content;

    @ManyToOne
    private Player player;
}
