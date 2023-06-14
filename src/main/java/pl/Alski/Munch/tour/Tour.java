package pl.Alski.Munch.tour;

import lombok.AllArgsConstructor;
import lombok.Data;
import pl.Alski.Munch.entity.Player;

@Data
@AllArgsConstructor
public class Tour {
    private Player player;
    TourPhase phase;
    private boolean foughtAMonster = false;


}
