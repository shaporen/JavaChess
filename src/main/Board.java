package main;

import main.piece.*;

import java.util.*;

public class Board {
    HashMap<Cordinates, Piece> pieces = new HashMap<>();

    public void setPeace(Cordinates cordinates, Piece piece) {
        piece.cordinates = cordinates;
        pieces.put(cordinates, piece);
    }

    public void setupDefaultPiecesPositions() {
        for (File file : File.values()) {
            setPeace(new Cordinates(file, 2), new Pawn(Color.WHITE, new Cordinates(file, 2)));
            setPeace(new Cordinates(file, 7), new Pawn(Color.BLACK, new Cordinates(file, 7)));
        }
    }

    public static boolean isSqureDark(Cordinates cordinates) {
        return (((cordinates.file.ordinal() + 1) + cordinates.rank) % 2) == 0;
    }

    public boolean isSquareEmpty(Cordinates cordinates) {
        return !pieces.containsKey(cordinates);
    }

    public Piece gerPiece(Cordinates cordinates) {
        return pieces.get(cordinates);
    }
}
