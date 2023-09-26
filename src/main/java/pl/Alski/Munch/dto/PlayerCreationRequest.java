package pl.Alski.Munch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.Alski.Munch.player.Sex;

@AllArgsConstructor
@Data
public class PlayerCreationRequest {
    private String name;
    private String email;
    private String password;
    private Sex sex;
}
