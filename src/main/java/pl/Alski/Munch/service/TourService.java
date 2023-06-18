package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.tour.Tour;

@Service
public interface TourService {
    Tour playPlayerTour(Player player);
}
