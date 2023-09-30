package pl.Alski.Munch.logic.cards.service.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;
import pl.Alski.Munch.logic.cards.treasureCard.TreasureCard;

@Service
public interface CardSaveService {
    void saveCard(DoorCard doorCard);
    void saveCard(TreasureCard treasureCard);
}
