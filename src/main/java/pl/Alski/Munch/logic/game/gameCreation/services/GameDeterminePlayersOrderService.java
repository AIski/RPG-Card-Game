package pl.Alski.Munch.logic.game.gameCreation.services;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.player.Player;

import java.util.List;

@Service
public interface GameDeterminePlayersOrderService {
    public List<Player> get(List<Player> players);
}
