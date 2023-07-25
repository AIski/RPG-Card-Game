package pl.Alski.Munch.cards.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.DAO.TreasureCardRepository;
import pl.Alski.Munch.cards.TreasureCard;

import java.util.List;

@Service
@AllArgsConstructor
public class CardGetAllTreasureCardsServiceImpl implements CardGetAllTreasureCardsService{
    private final TreasureCardRepository repository;
    @Override
    public List<TreasureCard> getAll() {
        return repository.findAll();
    }
}
