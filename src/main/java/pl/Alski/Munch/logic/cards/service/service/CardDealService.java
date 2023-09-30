package pl.Alski.Munch.logic.cards.service.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.Card;
import pl.Alski.Munch.logic.player.Player;

@Service
public interface CardDealService {
    <T extends Card> void dealCardToPlayer(T card, Player player);

}
