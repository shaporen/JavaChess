package main;

import main.piece.*;

public class Game {
    private final Board board;
    private BoardConsoleRenderer renderer = new BoardConsoleRenderer();

    public Game(Board board) {
        this.board = board;
    }

    public void gameLoop() {
        boolean isWhiteToMove = true;

        while(true) {
            renderer.render(board);
            //input
            Coordinates coordinates = InputCoordinates.
                    inputPieceCoordinatesForColor(isWhiteToMove ? Color.WHITE : Color.BLACK, board);
            Piece piece = board.getPiece(coordinates);
            //make move
            //pass move
            isWhiteToMove =! isWhiteToMove;
        }
    }
}
