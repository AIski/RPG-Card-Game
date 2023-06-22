package pl.Alski.Munch.gameCreation.services;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.gameCreation.GameCreationRequest;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.gameCreation.GameCreationResponse;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.tour.tourPhaseService.TourFirstPhaseServiceImpl;

import java.util.List;

@Service
@AllArgsConstructor
public class GameCreateServiceImpl implements GameCreateService {

    private final static Logger logger = LoggerFactory.getLogger(TourFirstPhaseServiceImpl.class);
    private GameDeterminePlayersOrderService determinePlayersOrderService;
    private CharacterCreateService characterCreateService;
    private GameSaveService gameSaveService;


    //  //1. pick game size- 3-6 players
    //    //2. Set up players queue
    //    //3. create characters at level 1,
    //    //4. add cards to game, shuffle both decks
    //    //5. deal the cards to each player- 4 Door and 4 Treasure for each

    @Override
    public GameCreationResponse createNewGame(GameCreationRequest request) {
        logger.info("Creating new game...");
        Game game = new Game();
        var players = determinePlayersOrderService.get(request.getPlayers());
        createCharacters(players);
        game.setPlayers(players);
        getCardsReady(game);
        dealStartingCardsToAllPlayers(game);
        gameSaveService.save(game);
        logger.info("Created new game, id: " + game.getId());
        return GameCreationResponse.builder()
                .gameId(game.getId())
                .players(game.getPlayers())
                .build();
    }

    private void createCharacters(List<Player> players) {
        logger.info("Creating characters...");
        for (Player player : players) {
            characterCreateService.createCharacter(player);
        }
    }

    private void getCardsReady(Game game) {
        logger.info("Getting cards ready...");
        game.getCardService().getCardsReady();
    }

    private void dealStartingCardsToAllPlayers(Game game) {
        logger.info("Dealing starting cards to all players...");
        for (int i = 0; i < 4; i++) {
            for (Player player : game.getPlayers()) {
                game.getCardService().dealNextDoorCard(player);
                game.getCardService().dealNextTreasureCard(player);
            }
        }

    }


}
