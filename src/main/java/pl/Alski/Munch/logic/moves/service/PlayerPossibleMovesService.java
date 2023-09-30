package pl.Alski.Munch.logic.moves.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.player.Player;
import pl.Alski.Munch.logic.moves.PlayerDetails;
import pl.Alski.Munch.logic.moves.PlayerMove;

import java.util.List;

@Service
public interface PlayerPossibleMovesService {
    List<PlayerMove> getPlayerMoves(PlayerDetails playerDetails);

    void setPlayerMoves(Player player, List<PlayerMove> moves);
    // + save player after setting it.

    void setPlayerMoves(List<Player> players, List<PlayerMove> moves);
    // + save player after setting it.

}
