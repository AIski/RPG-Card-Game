package pl.Alski.Munch.tour;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.Alski.Munch.player.Player;

@Data
@AllArgsConstructor
public class Tour {
    private Player player;
    TourPhase phase;
    TourStatus status;
    private boolean foughtAMonster = false;

}
