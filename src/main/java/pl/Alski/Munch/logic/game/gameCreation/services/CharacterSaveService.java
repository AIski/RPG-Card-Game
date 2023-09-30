package pl.Alski.Munch.logic.game.gameCreation.services;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.player.character.Character;

@Service
public interface CharacterSaveService {
    void save(Character character);
}
