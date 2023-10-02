package pl.Alski.Munch.logic.game;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.Alski.Munch.logic.player.Player;

import java.util.LinkedList;
import java.util.Queue;

@Component
@AllArgsConstructor
public class GameCreationQueue {
    private static GameCreationQueue INSTANCE;
    private final Queue<Player> playersQueue;

    private GameCreationQueue() {
        playersQueue = new LinkedList<>();
    }

    public static GameCreationQueue getInstance() {
        if(INSTANCE==null){
            INSTANCE= new GameCreationQueue();
        }
    return INSTANCE;
    }
}
