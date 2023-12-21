package main;

import java.util.*;

public class Board {
    HashMap<Cordinates, Piece> pieces = new HashMap<>();

    public void setPeace(Piece piece, Cordinates cordinates) {
        piece.cordinates = cordinates;
        pieces.put(cordinates, piece);
    }

    public void setupDefaultPiecesPositions() {}
}
