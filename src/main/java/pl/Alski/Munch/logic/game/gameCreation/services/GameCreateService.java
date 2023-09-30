package pl.Alski.Munch.logic.game.gameCreation.services;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.game.gameCreation.GameCreationRequest;
import pl.Alski.Munch.logic.game.gameCreation.GameCreationResponse;

@Service
public interface GameCreateService {
    GameCreationResponse createNewGame(GameCreationRequest gameRequest);

}
