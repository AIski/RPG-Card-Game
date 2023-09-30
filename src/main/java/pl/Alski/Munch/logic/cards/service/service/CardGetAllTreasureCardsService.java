package pl.Alski.Munch.logic.cards.service.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.treasureCard.TreasureCard;

import java.util.List;

@Service
public interface CardGetAllTreasureCardsService {
    List<TreasureCard> getAll();
}
