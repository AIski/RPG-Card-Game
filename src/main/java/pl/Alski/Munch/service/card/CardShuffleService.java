package pl.Alski.Munch.service.card;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;

import java.util.Stack;

@Service
public interface CardShuffleService {
    <T extends Card>  Stack<T> shuffle(Stack<T> cardsStack);
}
