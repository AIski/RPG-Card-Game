package pl.Alski.Munch.logic.player.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.Card;
import pl.Alski.Munch.logic.fight.FightProjectedOutcome;
import pl.Alski.Munch.logic.player.Player;

import java.util.List;

@Service
public class PlayerCommunicationServiceImpl implements PlayerCommunicationService{
    @Override
    public Card askPlayerWhichCard(Long id, List<Card> hand, String s) {
        return null;
    }

    @Override
    public boolean askPlayer(Player player, String question) {
        return false;
    }

    @Override
    public boolean sendProjectedOutcome(FightProjectedOutcome projectedOutcome) {
        return false;
    }
}
