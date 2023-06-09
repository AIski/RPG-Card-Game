package pl.Alski.Munch.cards.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.doorCards.DoorCard;
import pl.Alski.Munch.cards.treasureCards.TreasureCard;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Integer> {
    public List<DoorCard> getAllDoorCards();
    public List<TreasureCard> getAllTreasureCards();
}
