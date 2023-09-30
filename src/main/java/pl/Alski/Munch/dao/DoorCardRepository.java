package pl.Alski.Munch.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;

import java.util.List;

@RepositoryRestResource
public interface DoorCardRepository extends JpaRepository<DoorCard, Integer> {
    List<DoorCard> findAll();
}
