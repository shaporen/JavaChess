package main;

import main.piece.*;

public class BoardConsoleRenderer {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_WHITE_PIECE_COLOR = "\u001B[97m";
    public static final String ANSI_BLACK_PIECE_COLOR = "\u001B[30m";
    public static final String ANSI_WHITE_SQUARE_BACKGROUND = "\u001B[47m";
    public static final String ANSI_BLACK_SQUARE_BACKGROUND = "\u001B[0;100m";
    public static final String ANSI_HIGHLIGHTED_SQUARE_BACKGROUND = "\u001B[45m";
    public void render (Board board) {
        for (int rank = 8; rank >= 1; rank--) {
            String line = "";
            for (File file : File.values()) {
                Cordinates cordinates = new Cordinates(file, rank);
                if (board.isSquareEmpty(cordinates)) {
                    line += getSpriteForEmprtySquare(cordinates);
                } else {
                    line += getPieceSprite(board.gerPiece(cordinates));
                }
            }
            line += ANSI_RESET;
            System.out.println(line);
        }
    }

    private String getPieceSprite(Piece piece) {
        return colorizeSprite(" " + setUnicodeSpriteForPiece(piece) + " ", piece.color,
                Board.isSqureDark(piece.cordinates));
    }

    private String getSpriteForEmprtySquare(Cordinates cordinates) {
        return colorizeSprite("   ", Color.WHITE, Board.isSqureDark(cordinates));
    }

    private String setUnicodeSpriteForPiece(Piece piece) {
        return switch (piece.getClass().getSimpleName()) {
            case "Pawn" -> "♟";
            case "Knight" -> "♞";
            case "Bishop" -> "♝";
            case "Rook" -> "♜";
            case "Queen" -> "♛";
            case "King" -> "♚";
            default -> "";
        };
    }
    private String colorizeSprite(String sprite, Color peaceColor, boolean isSquareDark) {
        String result = sprite;

        if (peaceColor == Color.WHITE) {
            result = ANSI_WHITE_PIECE_COLOR + result;
        } else {
            result = ANSI_BLACK_PIECE_COLOR + result;
        }

        if (isSquareDark) {
            result = ANSI_BLACK_SQUARE_BACKGROUND + result;
        } else {
            result = ANSI_WHITE_SQUARE_BACKGROUND + result;
        }
        return result;
    }
}
