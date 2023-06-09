package pl.Alski.Munch.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;

import java.util.Random;
import java.util.Stack;

@Service
@AllArgsConstructor
public class CardShuffleServiceImpl implements CardShuffleService {

    private Random random;

    @Override
    public Stack<Card> shuffle(Stack<Card> cardsStack) {
        for (int i = cardsStack.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Card tempCard = cardsStack.get(i);
            cardsStack.set(i, cardsStack.get(j));
            cardsStack.set(j, tempCard);
        }
        return cardsStack;
    }
}
