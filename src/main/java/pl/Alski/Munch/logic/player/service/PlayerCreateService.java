package pl.Alski.Munch.logic.player.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.dto.PlayerCreationRequest;
import pl.Alski.Munch.logic.player.Player;

@Service
public interface PlayerCreateService {
    Player createPlayer(PlayerCreationRequest playerCreationRequest);
}
