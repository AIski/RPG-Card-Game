package pl.Alski.Munch.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.Alski.Munch.logic.moves.service.PlayerPossibleMovesService;
import pl.Alski.Munch.logic.moves.CardMove;
import pl.Alski.Munch.logic.moves.PlayerDetails;
import pl.Alski.Munch.logic.moves.PlayerMove;
import pl.Alski.Munch.logic.moves.service.PlayerMoveService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/player/move")
@AllArgsConstructor
public class MoveController {
    private PlayerPossibleMovesService possibleMoves;
    private PlayerMoveService moveService;

    @PostMapping("/getMoves")
    public ResponseEntity<List<PlayerMove>> getMoves(@RequestBody PlayerDetails playerDetails) {
        var response = possibleMoves.getPlayerMoves(playerDetails);
        return response != null ? ResponseEntity.ok(response) : ResponseEntity.notFound().build();
    }

    @GetMapping("/doNothing")
    public ResponseEntity<Void> doNothing(@RequestBody PlayerDetails playerDetails){
        moveService.doNothing(playerDetails);
        return null;
    }

    @GetMapping("/answer")
    public ResponseEntity<Void> answer(@RequestParam boolean response){
        moveService.answer(response);
        //for both- answer_question and Accept_the_outcome.
        return null;
    }

    @PostMapping("/useCard")
    public ResponseEntity<Void> useCard(@RequestBody CardMove cardMove){
        moveService.useCard(cardMove);
        return null;
    }

    @PostMapping("/giveCard")
    public ResponseEntity<Void> giveCard(@RequestBody CardMove cardMove){
        moveService.giveCard(cardMove);
        return null;
    }

    @PostMapping("/startTour")
    public ResponseEntity<Void> startTour(@RequestBody PlayerDetails playerDetails){
        moveService.startTour(playerDetails);
        return null;
    }




}
