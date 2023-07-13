package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.player.Player;

@Service
public class ModifierServiceImpl implements ModifierService{
    @Override
    public int getHandModifier(Player player) {
        return 0;
    }
}
