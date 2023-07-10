package pl.Alski.Munch.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.player.Player;

@Service
public interface CardServiceFacade {
    public void getCardsReady(Game game);

    void dealNextDoorCard(Player player, Game game);

    void dealNextTreasureCard(Player player, Game game);

    <T extends DoorCard> T dealNextDoorCardOnTable(Game game);

    <T extends Card> void discardCard(T card, Game game);
}
