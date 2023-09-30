package pl.Alski.Munch.mapper;

import org.mapstruct.Mapper;
import pl.Alski.Munch.dto.PlayerCreationRequest;
import pl.Alski.Munch.dto.PlayerDTO;
import pl.Alski.Munch.logic.player.Player;

@Mapper
public interface PlayerMapper {

    PlayerDTO toPlayerDTO(Player player);

    Player toPlayer(PlayerCreationRequest playerCreationRequest);

}
