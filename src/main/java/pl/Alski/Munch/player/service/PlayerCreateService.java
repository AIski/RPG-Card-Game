package pl.Alski.Munch.player.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.dto.PlayerCreationRequest;
import pl.Alski.Munch.player.Player;

@Service
public interface PlayerCreateService {
    Player createPlayer(PlayerCreationRequest playerCreationRequest);
}
