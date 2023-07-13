package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;

@Service
public interface GameSaveService {
     void save(Game game);

}
