package pl.Alski.Munch.logic.player.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.dto.PlayerCreationRequest;
import pl.Alski.Munch.dto.PlayerDTO;
import pl.Alski.Munch.mapper.PlayerMapper;

@Service
@AllArgsConstructor
public class PlayerServiceFacadeImpl implements PlayerServiceFacade{
    private final PlayerCreateService playerCreateService;
    private final PlayerMapper mapper;

    @Override
    public PlayerDTO createPlayer(PlayerCreationRequest playerCreationRequest) {
        return mapper.toPlayerDTO(
                playerCreateService.createPlayer(playerCreationRequest)
        );
    }
}
