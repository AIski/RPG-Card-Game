package pl.Alski.Munch.entity;

import jakarta.persistence.*;
import lombok.Data;
import pl.Alski.Munch.service.GameMasterService;

import pl.Alski.Munch.cards.CroupierService;

import java.util.List;

@Entity
@Data
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    private List<Player> players;
    private CroupierService croupier;


    private GameMasterService gameMaster;

    public void play(){
        gameMaster.playTheGame();
    }
}
