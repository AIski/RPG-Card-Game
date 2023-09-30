package pl.Alski.Munch.logic.cards.service.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.player.Player;
@Service
public interface CardDealNextDoorCardToPlayerService {
    void dealNextDoorCard(Player player, Game game);
}
