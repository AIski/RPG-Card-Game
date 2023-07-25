package pl.Alski.Munch.controller;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.cards.service.CardGetAllTreasureCardsService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cards")
@AllArgsConstructor
public class CardController {
    private CardGetAllTreasureCardsService cardsService;

    @GetMapping("/getAll")
    public ResponseEntity<List<TreasureCard>> getAll(){
        List<TreasureCard> response =  cardsService.getAll();
        return response.size()!=0? ResponseEntity.ok(response) : ResponseEntity.notFound().build();
    }

}
