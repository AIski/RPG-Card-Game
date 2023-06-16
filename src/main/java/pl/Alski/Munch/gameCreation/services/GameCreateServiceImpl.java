package pl.Alski.Munch.gameCreation.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.gameCreation.GameCreationRequest;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.player.Player;

import java.util.List;

@Service
@AllArgsConstructor
public class GameCreateServiceImpl implements GameCreateService {

    private GameDeterminePlayersOrderService determinePlayersOrderService;
    private CharacterCreateService characterCreateService;

    //  //1. pick game size- 3-6 players
    //    //2. Set up players queue
    //    //3. create characters at level 1,
    //    //4. add cards to game, shuffle both decks
    //    //5. deal the cards to each player- 4 Door and 4 Treasure for each

    @Override
    public Game createNewGame(GameCreationRequest request) {
        Game game = new Game();
        var players = determinePlayersOrderService.get(request.getPlayers());
        createCharacters(players);
        game.setPlayers(players);
        getCardsReady(game);
        dealStartingCardsToAllPlayers(game);
        return game;
    }

    private void createCharacters(List<Player> players) {
        for (Player player : players){
            characterCreateService.createCharacter(player);
        }
    }

    private void getCardsReady(Game game) {
        game.getCardService().getCardsReady();

    }

    private void dealStartingCardsToAllPlayers(Game game){
       for( int i=0; i<4; i++){
           for (Player player : game.getPlayers()){
               game.getCardService().dealNextDoorCard(player);
               game.getCardService().dealNextTreasureCard(player);
           }
       }

    }


}
