package pl.Alski.Munch.logic.cards.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.dao.TreasureCardRepository;
import pl.Alski.Munch.logic.cards.treasureCard.TreasureCard;
import pl.Alski.Munch.logic.cards.service.service.CardGetAllTreasureCardsService;

import java.util.List;

@Service
@AllArgsConstructor
public class CardGetAllTreasureCardsServiceImpl implements CardGetAllTreasureCardsService {
    private final TreasureCardRepository repository;
    @Override
    public List<TreasureCard> getAll() {
        return repository.findAll();
    }
}
