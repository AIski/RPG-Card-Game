package pl.Alski.Munch.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.player.Player;
@Service
public interface CardDealNextDoorCardToPlayerService {
    void dealNextDoorCard(Player player, Game game);
}
