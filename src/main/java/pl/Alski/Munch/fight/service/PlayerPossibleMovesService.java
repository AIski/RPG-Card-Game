package pl.Alski.Munch.fight.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.player.moves.PlayerDetails;
import pl.Alski.Munch.player.moves.PlayerMove;

import java.util.List;

@Service
public interface PlayerPossibleMovesService {
    List<PlayerMove> getPlayerMoves(PlayerDetails playerDetails);

    void setPlayerMoves(Player player, List<PlayerMove> moves);

    void setPlayerMoves(List<Player> players, List<PlayerMove> moves);
}
