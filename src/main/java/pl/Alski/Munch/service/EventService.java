package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Event;
import pl.Alski.Munch.entity.Player;

@Service
public interface EventService {
    void makeEventHappenToPlayer(Event event, Player player);
}
