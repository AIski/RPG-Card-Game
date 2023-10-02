package pl.Alski.Munch.logic.game.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.game.GameCreationRequest;
import pl.Alski.Munch.logic.game.GameCreationResponse;

@Service
public interface GameCreateService {
    GameCreationResponse createNewGame(GameCreationRequest gameRequest);

}
