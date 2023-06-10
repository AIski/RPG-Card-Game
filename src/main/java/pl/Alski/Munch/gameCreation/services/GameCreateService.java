package pl.Alski.Munch.gameCreation.services;

import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.gameCreation.GameCreationRequest;

public interface GameCreateService {
    Game createNewGame(GameCreationRequest gameRequest);

}
