package pl.Alski.Munch.player;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.entity.Message;
import pl.Alski.Munch.player.moves.PlayerMove;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private String name;
    private String email;
    private String password;
    private Sex sex;

    @OneToMany
    private Character character;

    private List<Card> hand;
    private List<PlayerMove> playerMoves;
    private List<Message> messages;

}
