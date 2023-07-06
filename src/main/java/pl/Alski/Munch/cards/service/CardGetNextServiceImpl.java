package pl.Alski.Munch.cards.service;

import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.cards.TreasureCard;
import pl.Alski.Munch.entity.Game;

public class CardGetNextServiceImpl implements CardGetNextService{
    private Card


    @Override
    public <T extends Card> Card getNextCard(Game game, T cardType) {
        if (cardType instanceof DoorCard){
            return getNextDoorCard(game);
        }
        if (cardType instanceof TreasureCard){
            return game.getTreasureCardsStack().pop();
        }
        return null;
    }

    private static DoorCard getNextDoorCard(Game game) {
        if (game.getDoorCardsStack().size()==0) {

        }
        return game.getDoorCardsStack().pop();
    }
}
