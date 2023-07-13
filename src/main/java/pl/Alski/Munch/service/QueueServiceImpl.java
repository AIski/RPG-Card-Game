package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.player.Player;

@Service
public class QueueServiceImpl implements QueueService{

    @Override
    public Player getNextPlayerInQueue(Game game) {
        //TODO: pop the first player from queue, serve him,
        return null;
    }

    public void resetQueue(){
        //TODO
    }
}
