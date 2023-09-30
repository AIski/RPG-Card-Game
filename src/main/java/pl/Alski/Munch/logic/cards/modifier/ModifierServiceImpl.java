package pl.Alski.Munch.logic.cards.modifier;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.player.Player;

@Service
public class ModifierServiceImpl implements ModifierService{
    @Override
    public int getHandModifier(Player player) {
        return 0;
    }
}
