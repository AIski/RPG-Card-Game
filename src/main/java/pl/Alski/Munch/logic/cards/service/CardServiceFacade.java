package pl.Alski.Munch.logic.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.Card;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.player.Player;

@Service
public interface CardServiceFacade {
    public void getCardsReady(Game game);

    void dealNextDoorCard(Player player, Game game);

    void dealNextTreasureCard(Player player, Game game);

    <T extends DoorCard> T dealNextDoorCardOnTable(Game game);

    <T extends Card> void discardCard(T card, Game game);
}
