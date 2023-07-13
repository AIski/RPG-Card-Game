package pl.Alski.Munch.gameCreation.services;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.gameCreation.GameCreationRequest;
import pl.Alski.Munch.gameCreation.GameCreationResponse;

@Service
public interface GameCreateService {
    GameCreationResponse createNewGame(GameCreationRequest gameRequest);

}
