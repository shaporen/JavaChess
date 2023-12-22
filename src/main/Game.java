package main;

import main.piece.*;

import java.util.*;

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
            Coordinates sourceCoordinates = InputCoordinates.
                    inputPieceCoordinatesForColor(isWhiteToMove ? Color.WHITE : Color.BLACK, board);
            Piece piece = board.getPiece(sourceCoordinates);
            Set<Coordinates> availableMoveSquares = piece.getAvailableMoveSquares(board);

            Coordinates targetCoordinates = InputCoordinates.inputAvailableSquare(availableMoveSquares);

            board.movePiece(sourceCoordinates, targetCoordinates);
            //make move

            //pass move
            isWhiteToMove =! isWhiteToMove;
        }
    }
}
