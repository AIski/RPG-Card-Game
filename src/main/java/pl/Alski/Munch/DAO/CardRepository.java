package pl.Alski.Munch.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.cards.TreasureCard;

import java.util.List;

public interface CardRepository extends JpaRepository<Card, Integer> {
    public List<DoorCard> getAllDoorCards();
    public List<TreasureCard> getAllTreasureCards();
}
