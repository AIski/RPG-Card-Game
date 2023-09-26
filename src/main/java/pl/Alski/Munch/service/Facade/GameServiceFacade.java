package pl.Alski.Munch.service.Facade;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.dto.GameDetails;
import pl.Alski.Munch.gameCreation.GameCreationRequest;
import pl.Alski.Munch.gameCreation.GameCreationResponse;
import pl.Alski.Munch.moves.PlayerDetails;

@Service
public interface GameServiceFacade {
    GameCreationResponse createNewGame(GameCreationRequest request);
    Boolean joinGameSearchQueue(PlayerDetails playerDetails);
    int getCurrentGameId(Integer playerId);
    GameDetails getGameDetails(Integer gameId, Integer playerId);

    PlayerDetails getPlayerDetails(int playerId);
}
