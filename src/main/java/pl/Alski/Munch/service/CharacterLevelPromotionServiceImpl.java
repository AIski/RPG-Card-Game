package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.character.Character;

@Service
public class CharacterLevelPromotionServiceImpl implements CharacterLevelPromotionService {
    @Override
    public void levelUp(Character character, int levels) {
        character.setLevel(character.getLevel() + levels);
    }

    @Override
    public void levelDown(Character character, int levels) {
        if (character.getLevel() - levels >= 1) {
            character.setLevel(character.getLevel() + levels);
        } else character.setLevel(1);
    }

}
