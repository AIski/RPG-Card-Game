package pl.Alski.Munch.logic.game.gameCreation.services;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.player.Player;

@Service
public interface CharacterCreateService {
    public void createCharacter(Player player);
}
