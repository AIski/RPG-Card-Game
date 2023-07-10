package pl.Alski.Munch.entity;

import jakarta.persistence.*;
import lombok.Data;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.gameCreation.GameMasterService;

import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.cards.service.CardServiceFacadeImpl;

import java.util.List;
import java.util.Stack;

@Entity
@Data
@Table(name = "games")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany
    @JoinColumn(name = "player_id")
    private List<Player> players;

    private Stack<DoorCard> doorCardsStack;
    private Stack<TreasureCard> treasureCardsStack;
    private Stack<DoorCard> usedDoorCardsStack;
    private Stack<TreasureCard> usedTreasureCardsStack;

    private Boolean fightMode = false;
    private Boolean isFinished = false;

    @OneToOne
    @JoinColumn(name = "winner_id")
    private Player winner;

}
