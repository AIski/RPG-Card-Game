package pl.Alski.Munch.gameCreation.services;

import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.gameCreation.GameCreationRequest;
import pl.Alski.Munch.gameCreation.GameCreationResponse;

public interface GameCreateService {
    GameCreationResponse createNewGame(GameCreationRequest gameRequest);

}
