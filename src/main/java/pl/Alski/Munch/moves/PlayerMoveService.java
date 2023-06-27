package pl.Alski.Munch.moves;

import org.springframework.stereotype.Service;

@Service
public interface PlayerMoveService {
    void doNothing(PlayerDetails playerDetails);

    void answer(boolean response);

    void useCard(CardMove cardMove);

    void giveCard(CardMove cardMove);

    void startTour(PlayerDetails playerDetails);
}
