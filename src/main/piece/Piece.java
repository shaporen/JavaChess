package main.piece;

import main.*;

abstract public class Piece {
    public final Color color;
    public Cordinates cordinates;

    public Piece(Color color, Cordinates cordinates) {
        this.color = color;
        this.cordinates = cordinates;
    }
}
