package pl.Alski.Munch.gameCreation.services;


import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.gameCreation.GameMasterServiceImpl;
import pl.Alski.Munch.player.Character;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.player.Race;

@Service
@AllArgsConstructor
public class CharacterCreateServiceImpl implements CharacterCreateService {
    CharacterSaveService characterSaveService;
    private final static Logger logger = LoggerFactory.getLogger(CharacterCreateServiceImpl.class);


    @Override
    public void createCharacter(Player player) {
        Character character = Character.builder()
                .name(player.getName())
                .race(Race.HUMAN)
                .sex(player.getSex())
                .handSize(5)
                .level(1)
                .gold(0)
                .player(player)
                .build();
        player.setCharacter(character);
        characterSaveService.save(character);

        logger.info("Created character " + character.getName() + " with id: " + character.getId() + ".");
    }
}
