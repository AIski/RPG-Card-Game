package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.events.Event;
import pl.Alski.Munch.player.Player;

@Service
public interface EventService {
    void makeEventHappenToPlayer(Event event, Player player);
}
