package pl.Alski.Munch.gameCreation;

import lombok.Data;
import pl.Alski.Munch.player.Player;

import java.util.List;

@Data
public class GameCreationRequest {
    private List<Player> players;
}
