package main.piece;

import main.*;

import java.util.*;

public class Knight extends Piece {

    public Knight(Color color, Coordinates coordinates) {
        super(color, coordinates);
    }

    @Override
    protected Set<CoordinatesShift> getPieceMoves() {
        return new HashSet<>(Arrays.asList(
                new CoordinatesShift(1, 2),
                new CoordinatesShift(2, 1),
                new CoordinatesShift(-1, 2),
                new CoordinatesShift(1, -2),
                new CoordinatesShift(-1, -2),
                new CoordinatesShift(-2, 1),
                new CoordinatesShift(2, -1),
                new CoordinatesShift(-2, -1)
        ));
    }
}
