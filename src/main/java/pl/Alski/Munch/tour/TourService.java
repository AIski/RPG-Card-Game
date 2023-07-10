package pl.Alski.Munch.tour;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.player.Player;

import java.util.List;

@Service
public interface TourService {
    Tour startPlayerTour(Player player, Game game);

    //1. Open the door
    //pick one Door card, play it on table, Front side up
    // if its a monster, you have to fight it.
    // monster fight        // no trade or stealing avaiable during this phase
    //If its a curse, its cast on you
    // anything else, you pick on your hand and can play imediately
    //2. Ask for trouble
    // if you didn't fight a monster on phase one, you can pick one of your hand to fight.
    // monster fight
    //3. Search the room
    // If you didn't fight monster so far, you can take another door card, and take it on your hand  without showing it.
    // if you fought a monster but run away, you cannot do this round
    //4. Show mercy
    // If you got too many items on your hand, play these you want at this point.
    // else you must give away the cards over the hand limit to player with lowest level.
    // if there are players with same, lowest level, you split the cards, as fair as possible.
    // if you are the lowest level, throw away extra cards.

    //Player on your left starts his tour now.



    ///monster fight:
    //            // if you can solo it
    //                // if you killed it, you get a level ( or two, deppending on monster)
    //                // if you killed it, you get a loot ( according to monster card info)
    //            // if you can't kill it by your own, you ask for help
    //                //if someone wants to help, you fight the monster together,
    //                    // if you killed it, you get a level ( or two, deppending on monster)
    //                    // person helping might get promotion on special occasions (ex. elf )
    //                   // if you killed it, you get a loot ( according to monster card info)
    //            // if you lose, you have to escape
    //            // if you escape, you dont get loot or level
    //            // if you fail to escape, you face the monster miserable end.

}
