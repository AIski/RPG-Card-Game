package pl.Alski.Munch.logic.condition.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.condition.Condition;
import pl.Alski.Munch.logic.player.Player;


@Service
public interface ConditionService {
     boolean checkCondition(Player player, Condition condition);
}
