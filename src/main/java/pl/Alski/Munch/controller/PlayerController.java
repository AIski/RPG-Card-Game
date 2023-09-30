package pl.Alski.Munch.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.Alski.Munch.dto.PlayerCreationRequest;
import pl.Alski.Munch.logic.player.service.PlayerServiceFacade;

@RestController
@RequestMapping("/api/v1/player")
@AllArgsConstructor
public class PlayerController {
    private final PlayerServiceFacade playerService;

    @PostMapping
    public ResponseEntity<Void> createPlayer(@RequestBody PlayerCreationRequest playerCreationRequest) {
        var player = playerService.createPlayer(playerCreationRequest);
        return player != null ? ResponseEntity.ok().build() : ResponseEntity.notFound().build();
    }



}
