package pl.Alski.Munch.entity;

import pl.Alski.Munch.entity.DoorCards.DoorCard;
import pl.Alski.Munch.service.Croupier;

import java.util.List;
import java.util.Stack;

public class Game {
    private List<Player> players;
    private Stack<DoorCard> doorCardStack;
    private Stack<TreasureCard> treasureCardStack;
    private Croupier croupier;

}
