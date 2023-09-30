package pl.Alski.Munch.logic.moves.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.moves.PlayerDetails;
import pl.Alski.Munch.logic.moves.PlayerMove;
import pl.Alski.Munch.logic.player.Player;

import java.util.List;

@Service
public class PlayerPossibleMovesServiceImpl implements PlayerPossibleMovesService{
    @Override
    public List<PlayerMove> getPlayerMoves(PlayerDetails playerDetails) {
        return null;
    }

    @Override
    public void setPlayerMoves(Player player, List<PlayerMove> moves) {

    }

    @Override
    public void setPlayerMoves(List<Player> players, List<PlayerMove> moves) {

    }
}
