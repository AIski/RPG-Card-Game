package pl.Alski.Munch.gameCreation;

import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.service.QueueService;
import pl.Alski.Munch.tour.TourService;


@Service
@AllArgsConstructor
public class GameMasterServiceImpl implements GameMasterService {

    @OneToOne
    private Game game;
    private QueueService queueService;
    private TourService tourService;


    @Override
    public void playTheGame() {
        while (!game.getIsFinished()) {
            for (int i = 0; i < game.getPlayers().size(); i++) {
               var tempPlayer = queueService.getNextPlayerInQueue();
               tourService.playPlayerTour(tempPlayer);
            }
        }
    }
}
