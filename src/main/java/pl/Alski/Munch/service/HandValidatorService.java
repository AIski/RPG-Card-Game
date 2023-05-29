package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Player;

@Service
public interface HandValidatorService {
    boolean validateHand(Player player);
}
