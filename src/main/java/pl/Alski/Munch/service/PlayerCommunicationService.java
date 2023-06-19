package pl.Alski.Munch.service;

import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.player.Player;

import java.util.List;

public interface PlayerCommunicationService {
    Card askPlayerWhichCard(Long id, List<Card> hand, String s);

    Player AskWhichPlayer(Card card, String s);

    boolean askPlayer(Player player, String question);
}
