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
import pl.Alski.Munch.cards.service.DealCardService;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.tour.Tour;
import pl.Alski.Munch.tour.TourPhase;
import pl.Alski.Munch.tour.TourStatus;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class TourPhaseServiceImpl implements TourPhaseService {

    private TourFirstPhaseService firstPhaseService;
    private TourSecondPhaseService secondPhaseService;
    private TourThirdPhaseService thirdPhaseService;
    private TourFourthPhaseService fourthPhaseService;

    private CardServiceFacade cardService;
    private FightService fightService;
    private CharacterLevelPromotionService promotionService;
    private final static Logger logger = LoggerFactory.getLogger(TourPhaseServiceImpl.class);
    private FightEscapeService escapeService;
    private HandValidatorService handValidatorService;
    private EventService eventService;
    private DealCardService dealCardService;

    @Override
    public Tour playFirstPhase(Tour tour) {

        return firstPhaseService.playFirstPhase(tour);
        }

        @Override
        public Tour playSecondPhase(Tour tour){
            return secondPhaseService.playSecondPhase(tour);
        }

        @Override
        public Tour playThirdPhase(Tour tour){
            return thirdPhaseService.playThirdPhase(tour);
        }

        @Override
        public Tour playFourthPhase(Tour tour){
           return fourthPhaseService.playFourthPhase(tour);
        }


    }
