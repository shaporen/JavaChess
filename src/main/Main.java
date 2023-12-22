package main;

import main.piece.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Board board = new Board();
        board.setupDefaultPiecesPositions();

        BoardConsoleRenderer renderer = new BoardConsoleRenderer();
        renderer.render(board);

        Piece piece = board.gerPiece(new Coordinates(File.G, 8));
        Set<Coordinates> available = piece.getAvailableMoveSquares(board);

        int i = 123;
    }
}