package pl.Alski.Munch.logic.cards.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.Card;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;
import pl.Alski.Munch.cards.service.card.service.*;
import pl.Alski.Munch.logic.cards.service.card.service.*;
import pl.Alski.Munch.logic.cards.service.service.*;
import pl.Alski.Munch.logic.game.Game;
import pl.Alski.Munch.logic.player.Player;
import pl.Alski.Munch.service.card.service.*;


@Service
@RequiredArgsConstructor
public class CardServiceFacadeImpl implements CardServiceFacade {
    private CardGetGameReadyService getCardsReadyService;
    private CardGetNextService getNextCardService;
    private CardDiscardService cardDiscardService;
    private CardDealNextDoorCardToPlayerService cardDealNextDoorCardToPlayerService;
    private CardDealNextTreasureCardToPlayerService cardDealNextTreasureCardToPlayerService;

    public void getCardsReady(Game game) {
        getCardsReadyService.getCardsReady(game);
    }

    public void dealNextDoorCard(Player player, Game game) {
        cardDealNextDoorCardToPlayerService.dealNextDoorCard(player, game);
    }

    public void dealNextTreasureCard(Player player, Game game) {
        cardDealNextTreasureCardToPlayerService.dealNextTreasureCard(player, game);
    }

    public <T extends DoorCard> T dealNextDoorCardOnTable(Game game) {
        return (T) getNextCardService.getNextDoorCard(game);
    }

    public <T extends Card> void discardCard(T card, Game game) {
        cardDiscardService.discardCard(card, game);
    }


}
