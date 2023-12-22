package main.piece;

import main.*;

abstract public class Piece {
    public final Color color;
    public Coordinates coordinates;

    public Piece(Color color, Coordinates cordinates) {
        this.color = color;
        this.coordinates = cordinates;
    }
}
