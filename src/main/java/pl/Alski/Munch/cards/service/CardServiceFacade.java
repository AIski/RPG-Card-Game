package pl.Alski.Munch.cards.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.player.Player;

@Service
public interface CardServiceFacade {

    void shuffleDoorCardsStack();

    void shuffleTreasureCardsStack();

    void dealNextDoorCard(Player player);

    void dealNextTreasureCard(Player player);

    <T extends DoorCard> T dealNextDoorCardOnTable();

    <T extends TreasureCard> T dealNextTreasureCardOnTable();

    <T extends Card> void discardCard(T card);



    public void getCardsReady();
}
