package pl.Alski.Munch.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.cards.TreasureCard;

@Service
public interface CardSaveService {
    void saveCard(DoorCard doorCard);
    void saveCard(TreasureCard treasureCard);
}
