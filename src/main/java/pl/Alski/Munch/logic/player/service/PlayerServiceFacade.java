package pl.Alski.Munch.logic.player.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.dto.PlayerCreationRequest;
import pl.Alski.Munch.dto.PlayerDTO;

@Service
public interface PlayerServiceFacade {
    PlayerDTO createPlayer(PlayerCreationRequest playerCreationRequest);
}
