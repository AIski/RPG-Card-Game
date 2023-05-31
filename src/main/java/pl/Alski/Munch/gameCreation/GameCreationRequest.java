package pl.Alski.Munch.gameCreation;

import lombok.Data;
import pl.Alski.Munch.entity.Player;

import java.util.List;

@Data
public class GameCreationRequest {
    private List<Player> players;
}
