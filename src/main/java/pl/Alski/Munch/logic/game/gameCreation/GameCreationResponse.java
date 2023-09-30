package pl.Alski.Munch.logic.game.gameCreation;

import lombok.Builder;
import lombok.Data;
import pl.Alski.Munch.logic.player.Player;

import java.util.List;

@Data
@Builder
public class GameCreationResponse {
    private Long gameId;
    private List<Player> players;
}
