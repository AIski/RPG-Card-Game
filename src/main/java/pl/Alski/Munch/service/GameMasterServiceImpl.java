package pl.Alski.Munch.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.gameCreation.services.GameCreateService;


@Service
@AllArgsConstructor
public class GameMasterServiceImpl implements GameMasterService {

    private Game game;
    private GameCreateService gameCreator;

    @Override
    public void playTheGame() {

    }
}
