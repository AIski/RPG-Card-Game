package pl.Alski.Munch.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.player.Player;

@Service
public interface CardGiveAwayService {
    void giveAway(Card card, Player player);
}
