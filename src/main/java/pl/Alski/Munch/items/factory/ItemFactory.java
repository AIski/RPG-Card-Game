package pl.Alski.Munch.items.factory;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.items.Item;
import pl.Alski.Munch.conditions.requirements.Requirement;
import pl.Alski.Munch.items.bonus.Bonus;
import pl.Alski.Munch.items.modifiers.Modifier;

@Service
public interface ItemFactory {
    Item createItem(String name,
                    Bonus bonus,
                    int goldWorth,
                    Requirement requirement,
                    Modifier modifier,
                    boolean isBigItem
                    );
}
