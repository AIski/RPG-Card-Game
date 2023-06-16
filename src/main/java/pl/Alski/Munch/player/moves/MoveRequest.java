package pl.Alski.Munch.player.moves;

import lombok.Data;

@Data
public class MoveRequest {
     private boolean moveResponse;
     private PossibleMove possibleMove;
}
