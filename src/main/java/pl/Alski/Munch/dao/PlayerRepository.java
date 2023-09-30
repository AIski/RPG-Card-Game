package pl.Alski.Munch.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pl.Alski.Munch.logic.player.Player;

import java.util.List;

@RepositoryRestResource
public interface PlayerRepository extends JpaRepository<Player, Long> {
     List<Player> findAll();
}
