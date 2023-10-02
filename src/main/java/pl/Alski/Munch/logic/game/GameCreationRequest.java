package pl.Alski.Munch.logic.game;

import lombok.Data;
import pl.Alski.Munch.logic.player.Player;

import java.util.List;

@Data
public class GameCreationRequest {
    private List<Player> players;

    public void addPlayer(Player player){
        players.add(player);
    }

    public void removePlayer(Player player){
        players.remove(player);
    }
}
