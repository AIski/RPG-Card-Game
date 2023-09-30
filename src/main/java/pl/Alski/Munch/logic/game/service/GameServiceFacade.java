package pl.Alski.Munch.logic.game.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.dto.GameDetails;
import pl.Alski.Munch.logic.game.gameCreation.GameCreationRequest;
import pl.Alski.Munch.logic.game.gameCreation.GameCreationResponse;
import pl.Alski.Munch.logic.moves.PlayerDetails;

@Service
public interface GameServiceFacade {
    GameCreationResponse createNewGame(GameCreationRequest request);
    Boolean joinGameSearchQueue(PlayerDetails playerDetails);
    int getCurrentGameId(Integer playerId);
    GameDetails getGameDetails(Integer gameId, Integer playerId);

    PlayerDetails getPlayerDetails(int playerId);
}
