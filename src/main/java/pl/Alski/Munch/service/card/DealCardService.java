package pl.Alski.Munch.service.card;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.entity.Player;

@Service
public interface DealCardService {
    <T extends Card> void dealCardToPlayer(T card, Player player);
}
