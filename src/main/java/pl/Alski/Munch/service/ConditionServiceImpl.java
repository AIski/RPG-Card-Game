package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.conditions.Condition;
import pl.Alski.Munch.player.Player;

@Service
public class ConditionServiceImpl implements ConditionService{
    @Override
    public boolean checkCondition(Player player, Condition condition) {
        //TODO: this code
        return false;
    }
}
