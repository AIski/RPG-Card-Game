package pl.Alski.Munch.entity;

import jakarta.persistence.*;
import lombok.Data;
import pl.Alski.Munch.GameMasterService;

import pl.Alski.Munch.cards.service.CardServiceFacadeImpl;

import java.util.List;

@Entity
@Data
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private List<Player> players;

    @OneToOne
    private CardServiceFacadeImpl cardService;

    @OneToOne
    private GameMasterService gameMaster;

    private Boolean isFinished = false;

    @ManyToOne
    @JoinColumn(name = "winner_id")
    private Player winner;

    public void play() {
        gameMaster.playTheGame();
    }
}
