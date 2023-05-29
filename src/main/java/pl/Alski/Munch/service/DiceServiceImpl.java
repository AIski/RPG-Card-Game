package pl.Alski.Munch.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Random;


@Service
public class DiceServiceImpl implements DiceService{
    private final Logger logger = LoggerFactory.getLogger(DiceServiceImpl.class);
    private final Random random = new Random();

    @Override
    public int roll() {
        int result = random.nextInt(5)+1;
        logger.info("Rolled "+result+"");
        return result;
    }
}
