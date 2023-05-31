package pl.Alski.Munch.gameCreation.services;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Player;

@Service
public interface CharacterCreateService {
    public void createCharacter(Player player);
}
