package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Player;

import java.util.Queue;

@Service
public class QueueServiceImpl implements QueueService{

    private Queue<Player> playersQueue;

    @Override
    public Player getNextPlayerInQueue() {
        //TODO: pop the first player from queue, serve him,
        return null;
    }

    public void resetQueue(){
        //TODO
    }
}
