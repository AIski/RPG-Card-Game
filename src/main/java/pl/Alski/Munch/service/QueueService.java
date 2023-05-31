package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Player;

import java.util.List;

@Service
public interface QueueService {

    Player getNextPlayerInQueue();
}
