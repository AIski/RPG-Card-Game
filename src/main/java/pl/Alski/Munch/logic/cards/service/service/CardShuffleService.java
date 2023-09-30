package pl.Alski.Munch.logic.cards.service.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.logic.cards.Card;

import java.util.Stack;

@Service
public interface CardShuffleService {
    <T extends Card>  Stack<T> shuffle(Stack<T> cardsStack);
}
