package pl.Alski.Munch.logic.moves.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.moves.CardMove;
import pl.Alski.Munch.logic.moves.PlayerDetails;

@Service
public interface PlayerMoveService {
    void doNothing(PlayerDetails playerDetails);

    void answer(boolean response);

    void useCard(CardMove cardMove);

    void giveCard(CardMove cardMove);

    void startTour(PlayerDetails playerDetails);
}
