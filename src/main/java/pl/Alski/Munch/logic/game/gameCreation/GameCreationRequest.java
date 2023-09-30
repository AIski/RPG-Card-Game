package pl.Alski.Munch.logic.game.gameCreation;

import lombok.Data;
import pl.Alski.Munch.logic.player.Player;

import java.util.List;

@Data
public class GameCreationRequest {
    private List<Player> players;
}
