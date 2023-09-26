package pl.Alski.Munch.player.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.Alski.Munch.DAO.PlayerRepository;
import pl.Alski.Munch.dto.PlayerCreationRequest;
import pl.Alski.Munch.mapper.PlayerMapper;
import pl.Alski.Munch.player.Player;

@Service
@AllArgsConstructor
public class PlayerCreateServiceImpl implements PlayerCreateService{
    private final PlayerMapper mapper;
    private final PlayerRepository playerRepository;

    @Override
    public Player createPlayer(PlayerCreationRequest playerCreationRequest) {
        Player player = mapper.toPlayer(playerCreationRequest);
        playerRepository.save(player);
        return player;
    }
}
