package pl.Alski.Munch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.player.Sex;

@Data
@AllArgsConstructor
public class PlayerDTO {
    private Long id;
    private String name;
    private String email;
    private Sex sex;
    private Game currentGame;
}
