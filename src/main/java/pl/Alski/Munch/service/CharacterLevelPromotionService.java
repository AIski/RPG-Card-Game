package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.character.Character;

@Service
public interface CharacterLevelPromotionService {
    void levelUp(Character character, int levels);
    void levelDown(Character character, int levels);
}

