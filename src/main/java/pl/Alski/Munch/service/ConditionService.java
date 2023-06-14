package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Player;

import java.util.concurrent.locks.Condition;

@Service
public interface ConditionService {
     boolean checkCondition(Player player, Condition condition);
}
