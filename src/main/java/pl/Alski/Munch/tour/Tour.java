package pl.Alski.Munch.tour;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.Alski.Munch.player.Player;

import java.util.List;

@Data
@AllArgsConstructor
public class Tour {
    private Player player;
    private TourPhase phase;
    private TourStatus status;
    private boolean foughtAMonster = false;
    private List<Player> spectators;

}
