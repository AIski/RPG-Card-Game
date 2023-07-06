package pl.Alski.Munch.player;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.entity.Message;
import pl.Alski.Munch.moves.PlayerMove;

import java.util.List;

@Entity
@Table(name = "players")
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

    @OneToOne(mappedBy = "player")
    private Character gameCharacter;

    private List<Card> hand;
    private List<PlayerMove> playerMoves;
    private List<Message> messages;

}
