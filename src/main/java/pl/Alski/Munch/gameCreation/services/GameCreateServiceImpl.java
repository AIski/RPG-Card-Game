package pl.Alski.Munch.gameCreation.services;

import pl.Alski.Munch.cards.CroupierService;
import pl.Alski.Munch.gameCreation.GameCreationRequest;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.entity.Player;

import java.util.List;

public class GameCreateServiceImpl implements GameCreateService {

    private int gameSize;
    private  List<Player> players;
    private CroupierService croupier;
    private GameDeterminePlayersOrderService determinePlayersOrderService;
    private CharacterCreateService characterCreateService;


    private Game game;

    @Override
    public void createNewGame(GameCreationRequest request) {
        players = determinePlayersOrderService.get(request.getPlayers());
        createCharacters();
        game.setPlayers(players);
        setCards();
        //  //1. pick game size- 3-6 players
        //    //2. Set up players queue
        //    //3. create characters at level 1,
        //    //4. add cards to game, shuffle both decks
        //    //5. deal the cards to each player- 4 Door and 4 Treasure for each
    }

    private void setCards() {
    }

    private void createCharacters() {
        for (Player player : players){
            characterCreateService.createCharacter(player);
        }
    }


}
