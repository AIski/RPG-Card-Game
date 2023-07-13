package pl.Alski.Munch.cards.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.DAO.DoorCardRepository;
import pl.Alski.Munch.DAO.TreasureCardRepository;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.cards.TreasureCard;

@Service
@AllArgsConstructor
public class CardSaveServiceImpl implements CardSaveService{
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
