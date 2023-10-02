package pl.Alski.Munch.logic.game.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.dice.DiceService;
import pl.Alski.Munch.logic.player.Player;

import java.util.List;

@Service
@AllArgsConstructor
public class GameDeterminePlayersOrderServiceImpl implements GameDeterminePlayersOrderService {

    private final DiceService diceService;
    @Override
    public List<Player> getOrder(List<Player> players) {
        //TODO: THIS LOGIC
        return null;
    }
}
