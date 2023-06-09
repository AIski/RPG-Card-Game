package pl.Alski.Munch.service;

import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.Card;

import java.util.Stack;

@Service
public interface CardShuffleService {
    Stack<Card> shuffle(Stack<Card> cardsStack);
}
