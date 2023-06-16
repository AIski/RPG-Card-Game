package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.player.Player;

import java.util.concurrent.locks.Condition;

@Service
public interface ConditionService {
     boolean checkCondition(Player player, Condition condition);
}
