package pl.Alski.Munch.entity;

import lombok.Data;
import pl.Alski.Munch.player.Player;

@Data
public class Message {
    private String content;
    private Player player;
}
