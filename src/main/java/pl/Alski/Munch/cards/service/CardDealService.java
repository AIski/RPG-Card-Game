package pl.Alski.Munch.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.player.Player;

@Service
public interface CardDealService {
    <T extends Card> void dealCardToPlayer(T card, Player player);

}
