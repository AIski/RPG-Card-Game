package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.conditions.Condition;
import pl.Alski.Munch.player.Player;


@Service
public interface ConditionService {
     boolean checkCondition(Player player, Condition condition);
}
