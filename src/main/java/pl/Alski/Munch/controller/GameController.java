package pl.Alski.Munch.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.Alski.Munch.gameCreation.GameCreationRequest;
import pl.Alski.Munch.gameCreation.GameCreationResponse;
import pl.Alski.Munch.gameCreation.GameSearchService;
import pl.Alski.Munch.gameCreation.services.GameCreateService;
import pl.Alski.Munch.player.moves.PlayerDetails;

@RestController
@RequestMapping("/api/v1/game")
@AllArgsConstructor
public class GameController {
    private GameCreateService gameCreateService;
    private GameSearchService gameSearchService;

    @PostMapping("/create")
    public ResponseEntity<GameCreationResponse> createGame(@RequestBody GameCreationRequest request){
        var response =  gameCreateService.createNewGame(request);
        return response!=null? ResponseEntity.ok(response) : ResponseEntity.notFound().build();
    }
    @PostMapping("/join")
    public ResponseEntity<GameCreationResponse> joinGameSearchQueue(@RequestBody PlayerDetails playerDetails){
         gameSearchService.joinGameSearchQueue(playerDetails);
//        TODO: finish that.
        return null;
    }

}
