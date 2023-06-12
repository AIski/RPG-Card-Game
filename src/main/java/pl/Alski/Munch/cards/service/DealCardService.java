package pl.Alski.Munch.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.entity.Player;

@Service
public interface DealCardService {
    <T extends Card> void dealCardToPlayer(T card, Player player);

    <T extends Card> void dealCardOnPlayer(T card, Player player);
}
