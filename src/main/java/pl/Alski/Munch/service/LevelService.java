package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;

@Service
public interface LevelService {
    void levelUp(Character character, int levels);
    void levelDown(Character character, int levels);
}

