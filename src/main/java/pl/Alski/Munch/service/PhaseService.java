package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.entity.Phase;

@Service
public interface PhaseService {
    Phase getNextPhase();
    //1. Open the door
}
