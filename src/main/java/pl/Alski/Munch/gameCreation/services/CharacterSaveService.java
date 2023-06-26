package pl.Alski.Munch.gameCreation.services;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.player.Character;

@Service
public interface CharacterSaveService {
    void save(Character character);
}
