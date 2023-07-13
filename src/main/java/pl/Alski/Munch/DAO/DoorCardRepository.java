package pl.Alski.Munch.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.cards.TreasureCard;

import java.util.List;

@RepositoryRestResource
public interface DoorCardRepository extends JpaRepository<DoorCard, Integer> {
    List<DoorCard> findAll();
}
