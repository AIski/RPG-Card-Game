package pl.Alski.Munch.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.cards.TreasureCard;

import java.util.List;

@RepositoryRestResource
public interface TreasureCardRepository extends JpaRepository<TreasureCard, Long> {
     List<TreasureCard> findAll();
}
