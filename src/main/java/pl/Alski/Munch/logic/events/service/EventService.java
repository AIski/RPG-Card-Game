package pl.Alski.Munch.logic.events.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.events.Event;
import pl.Alski.Munch.logic.player.Player;

@Service
public interface EventService {
    void makeEventHappenToPlayer(Event event, Player player);
}
