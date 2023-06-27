package pl.Alski.Munch.cards.service;

import pl.Alski.Munch.cards.DoorCard;
import pl.Alski.Munch.player.Player;

public interface CardUseService {
    void useCard(Player player, DoorCard currentDoorCard);
    // TODO: check what type of card it is, if its self-use, check if he can use it. If not, say its not possible
    // if it can be thrown on other players, ask who to use it on, and to the use it on pickedPlayer logic
}
