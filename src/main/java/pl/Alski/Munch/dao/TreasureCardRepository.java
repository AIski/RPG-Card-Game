package pl.Alski.Munch.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.Alski.Munch.logic.cards.treasureCard.TreasureCard;

import java.util.List;

@RepositoryRestResource
public interface TreasureCardRepository extends JpaRepository<TreasureCard, Long> {
     List<TreasureCard> findAll();
}
