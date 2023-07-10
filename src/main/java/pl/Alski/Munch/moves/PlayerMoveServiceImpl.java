package pl.Alski.Munch.moves;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PlayerMoveServiceImpl implements PlayerMoveService{
    @Override
    public void doNothing(PlayerDetails playerDetails) {

    }

    @Override
    public void answer(boolean response) {

    }

    @Override
    public void useCard(CardMove cardMove) {

    }

    @Override
    public void giveCard(CardMove cardMove) {

    }

    @Override
    public void startTour(PlayerDetails playerDetails) {

    }
}
