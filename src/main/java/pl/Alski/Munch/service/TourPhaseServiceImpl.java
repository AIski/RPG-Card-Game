package pl.Alski.Munch.service;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;
import pl.Alski.Munch.cards.doorCards.Curse;
import pl.Alski.Munch.cards.doorCards.DoorCard;
import pl.Alski.Munch.cards.doorCards.Monster;
import pl.Alski.Munch.cards.doorCards.fight.Fight;
import pl.Alski.Munch.cards.doorCards.fight.FightService;
import pl.Alski.Munch.cards.doorCards.fight.escape.FightEscapeService;
import pl.Alski.Munch.cards.service.CardServiceFacade;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.tour.Tour;
import pl.Alski.Munch.tour.TourPhase;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TourPhaseServiceImpl implements TourPhaseService {

    private CardServiceFacade cardService;
    private FightService fightService;
    private CharacterLevelPromotionService promotionService;
    private final static Logger logger = LoggerFactory.getLogger(TourPhaseServiceImpl.class);
    private ConditionService conditionService;
    private FightEscapeService escapeService;
    private HandValidatorService handValidatorService;

    @Override
    public void startFirstPhase(Tour tour) {
        tour.setPhase(TourPhase.ASK_FOR_TROUBLE);
        DoorCard currentDoorCard = cardService.dealNextDoorCardOnTable();
        logger.info(tour.getPlayer().getName() + " rolled + " + currentDoorCard.toString());
        Player currentPlayer = tour.getPlayer();
        if (currentDoorCard instanceof Monster) {
            Fight fight = fightService.startFight(currentPlayer, (Monster) currentDoorCard);
            if (fight.isWon()) {
                //check player is eligible for promotion
                // if so, promote him
                //check player is eligible for loot, if so, call the loot

                // TODO

                cardService.discardCard(currentDoorCard);
            } else {
                boolean escapeResult = escapeService.tryToEscapeFromAllMonsters(currentPlayer, fight);
                if (escapeResult) {
                    cardService.discardCard(currentDoorCard);
                }
                //            // if you escape, you dont get loot or level
                //            // if you fail to escape, you face the monster miserable end.
            }
            tour.setFoughtAMonster(true);
        }
        if (currentDoorCard instanceof Curse) {

            // TODO this.
        }
        logger.
        tour.setPhaseCompleted(true);

    }

    @Override
    public void startSecondPhase(Tour tour) {
        tour.setPhase(TourPhase.ASK_FOR_TROUBLE);
        List<Card> monsterList = tour.getPlayer().getHand().stream()
                .filter(a -> a instanceof Monster)
                .collect(Collectors.toList());
        // if player wants, he can fight one of his monsters
        //TODO: this code. need to send request to player, get response, proceed with fight if necessary
        boolean playerResponse = playerCommunicationService.askPlayer("Do Ask For Trouble? (Do you want to fight any of the monsters from your hand?)");
         if (playerResponse) {
             playerCommunicationService.askPlayer("Which monster do you want to fight? ", monsterList);
            // if player picks a monster, set the fight,
             // else return
             tour.setPhase;
         }
    }

    @Override
    public void startThirdPhase(Tour tour) {
        tour.setPhase(TourPhase.SEARCH_THE_ROOM);
        //Ask player, if he want to pick extra door card.

        boolean playerResponse = playerCommunicationService.askPlayer()
        cardService.dealNextDoorCard(tour.getPlayer());
    }

    @Override
    public void startFourthPhase(Tour tour) {
        // If you got too many items on your hand, play these you want at this point.
        // else you must give away the cards over the hand limit to player with lowest level.
        // if there are players with same, lowest level, you split the cards, as fair as possible.
        // if you are the lowest level, throw away extra cards.
        boolean playerHasTooManyCards =!handValidatorService.validateHand(tour.getPlayer())
        while(playerHasTooManyCards){
            playerCommunicationService.askPlayer("You have too many cards on your hand." +
                    , monsterList);


        }
    }


}
