package pl.Alski.Munch.logic.cards.service.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.doorCard.DoorCard;
import pl.Alski.Munch.logic.cards.treasureCard.TreasureCard;
import pl.Alski.Munch.logic.game.Game;

@Service
public interface CardGetNextService {
    <T extends DoorCard> DoorCard getNextDoorCard(Game game);
    <T extends TreasureCard> TreasureCard getNextTreasureCard(Game game);
}
