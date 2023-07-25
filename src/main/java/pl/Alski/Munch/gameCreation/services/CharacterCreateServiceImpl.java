package pl.Alski.Munch.gameCreation.services;


import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.player.Character;
import pl.Alski.Munch.player.Player;

@Service
@AllArgsConstructor
public class CharacterCreateServiceImpl implements CharacterCreateService {
    private CharacterSaveService characterSaveService;
    private final static Logger logger = LoggerFactory.getLogger(CharacterCreateServiceImpl.class);


    @Override
    public void createCharacter(Player player) {
        Character character = Character.builder()
                .name(player.getName())
                .raceCard(null)
                .characterClass(null)
                .sex(player.getSex())
                .handSize(5)
                .level(1)
                .player(player)
                .build();
        player.setGameCharacter(character);
        characterSaveService.save(character);

        logger.info("Created character " + character.getName() + " with id: " + character.getId() + ".");
    }
}
