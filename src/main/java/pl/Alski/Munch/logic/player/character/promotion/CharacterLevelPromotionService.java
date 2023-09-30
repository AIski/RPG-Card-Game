package pl.Alski.Munch.logic.player.character.promotion;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.player.character.Character;

@Service
public interface CharacterLevelPromotionService {
    void levelUp(Character character, int levels);
    void levelDown(Character character, int levels);
}

