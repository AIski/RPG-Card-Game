package pl.Alski.Munch.logic.player;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.message.Message;
import pl.Alski.Munch.logic.moves.PlayerMove;
import pl.Alski.Munch.logic.player.character.Character;
import pl.Alski.Munch.logic.player.hand.Hand;

import java.util.List;

@Entity
@Table(name = "players")
@NoArgsConstructor
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", nullable = false)
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "EMAIL", nullable = false)
    private String email;

    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(name = "SEX", nullable = false)
    private Sex sex;

    @OneToOne(mappedBy = "player")
    @JoinColumn(name="EQUIPMENT_ID", referencedColumnName = "id")
    private Character gameCharacter;

    @OneToOne
    @JoinColumn(name="EQUIPMENT_ID", referencedColumnName = "id")
    private Hand hand;

    private List<PlayerMove> playerMoves;

    @OneToMany
    private List<Message> messages;


    @ManyToOne
    @JoinTable(name = "GAME_PLAYERS",
    joinColumns = @JoinColumn(name="PLAYER_ID"),
            inverseJoinColumns = @JoinColumn(name="GAME_ID"))
    private Game currentGame;

}
