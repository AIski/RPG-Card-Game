package pl.Alski.Munch.logic.cards.service.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.Card;
import pl.Alski.Munch.logic.player.Player;

@Service
public interface CardGiveAwayService {
    void giveAway(Card card, Player player);
}
