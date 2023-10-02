package pl.Alski.Munch.logic.game.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.player.Player;
import pl.Alski.Munch.logic.player.character.Character;

@Service
public interface CharacterCreateService {
    public void createCharacter(Player player);

}
