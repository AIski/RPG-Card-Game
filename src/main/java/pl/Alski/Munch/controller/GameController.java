package pl.Alski.Munch.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import pl.Alski.Munch.dto.GameDetails;
import pl.Alski.Munch.logic.game.gameCreation.GameCreationRequest;
import pl.Alski.Munch.logic.game.gameCreation.GameCreationResponse;
import pl.Alski.Munch.logic.moves.PlayerDetails;
import pl.Alski.Munch.logic.game.service.GameServiceFacade;

@RestController
@RequestMapping("/api/v1/game")
@AllArgsConstructor
public class GameController {
    private GameServiceFacade gameService;


    //THIS SHOULD BE SYSTEM INTERNAL METHOD, BEING RUN AUTOMATICALLY, POPPING players from queue stack
    // then creating new game
    @PostMapping("/create")
    public ResponseEntity<GameCreationResponse> createGame(@RequestBody GameCreationRequest request) {
        var response = gameService.createNewGame(request);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.notFound().build();
    }

    @PostMapping("/join")
    public ResponseEntity<Void> joinGameSearchQueue(@RequestBody PlayerDetails playerDetails) {
        var result = gameService.joinGameSearchQueue(playerDetails);
        return result ? ResponseEntity.ok().build() : ResponseEntity.internalServerError().build();
    }

    @GetMapping("/getCurrentGameId")
    public ResponseEntity<Integer> getCurrentGame(@RequestParam Integer playerId){
        int gameId= gameService.getCurrentGameId(playerId);
        return gameId!=0? ResponseEntity.ok(gameId) : ResponseEntity.notFound().build()
    }

    //TODO: It should be protected endpoint
    @GetMapping("/gameDetails")
    public ResponseEntity<GameDetails> getGameDetails(Authentication authentication, @RequestParam Integer gameId){
        int playerId = Integer.parseInt(authentication.getName());
        var response = gameService.getGameDetails(gameId, playerId);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.notFound().build();
    }

    //TODO: This endpoint needs to be protected
    @GetMapping("/playerDetails")
    public ResponseEntity<PlayerDetails> getPlayerDetails(Authentication authentication){
        int playerId = Integer.parseInt(authentication.getName());
        var response = gameService.getPlayerDetails(playerId);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.notFound().build();
    }
}
