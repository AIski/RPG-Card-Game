package pl.Alski.Munch.races;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("human")
public class Human extends Race {
}
