package pl.Alski.Munch.logic.cards.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.service.service.CardSaveService;
import pl.Alski.Munch.dao.DoorCardRepository;
import pl.Alski.Munch.dao.TreasureCardRepository;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;
import pl.Alski.Munch.logic.cards.treasureCard.TreasureCard;

@Service
@AllArgsConstructor
public class CardSaveServiceImpl implements CardSaveService {
    private final TreasureCardRepository treasureCardRepository;
    private final DoorCardRepository doorCardRepository;

    @Override
    public void saveCard(DoorCard doorCard) {
        doorCardRepository.save(doorCard);
    }

    @Override
    public void saveCard(TreasureCard treasureCard) {
    treasureCardRepository.save(treasureCard);
    }
}
