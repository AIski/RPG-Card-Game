package pl.Alski.Munch.gameCreation.services;

import org.hibernate.service.spi.InjectService;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;

@Service
public interface GameSaveService {
     void save(Game game);
     //TODO: add logger inside method implementation
}
