package pl.Alski.Munch.gameCreation.services;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.cards.service.CardServiceFacade;
import pl.Alski.Munch.entity.Game;
import pl.Alski.Munch.gameCreation.GameCreationRequest;
import pl.Alski.Munch.gameCreation.GameCreationResponse;
import pl.Alski.Munch.player.Player;
import pl.Alski.Munch.service.GameSaveService;
import pl.Alski.Munch.tour.tourPhaseService.TourFirstPhaseServiceImpl;

import java.util.List;

@Service
@AllArgsConstructor
public class GameCreateServiceImpl implements GameCreateService {

    private final static Logger logger = LoggerFactory.getLogger(TourFirstPhaseServiceImpl.class);
    private final GameDeterminePlayersOrderService determinePlayersOrderService;
    private final CharacterCreateService characterCreateService;
    private final GameSaveService gameSaveService;
    private final CardServiceFacade cardService;

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
        cardService.getCardsReady(game);
    }

    private void dealStartingCardsToAllPlayers(Game game) {
        logger.info("Dealing starting cards to all players...");
        for (int i = 0; i < 4; i++) {
            for (Player player : game.getPlayers()) {
                cardService.dealNextDoorCard(player, game);
                cardService.dealNextTreasureCard(player, game);
            }
        }

    }


}
