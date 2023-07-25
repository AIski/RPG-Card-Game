package pl.Alski.Munch.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.TreasureCard;

import java.util.List;

@Service
public interface CardGetAllTreasureCardsService {
    List<TreasureCard> getAll();
}
