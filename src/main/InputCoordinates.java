package main;

import java.util.*;

public class InputCoordinates {

    private static final Scanner scanner = new Scanner(System.in);

    public static Coordinates input() {
        while (true) {
            System.out.println("Please enter coordinates (ex. a1)");
            String line = scanner.nextLine();
            if (line.length() != 2) {
                System.out.println("Invalide format");
                continue;
            }

            char fileChar = line.charAt(0);
            char rankChar = line.charAt(1);

            if (!Character.isLetter(fileChar)) {
                System.out.println("Invalide format");
            }

            if (!Character.isDigit(rankChar)) {
                System.out.println("Invalide format");
            }

            int rank = Character.getNumericValue(rankChar);
            if ((rank < 1) || (rank > 8)) {
                System.out.println("Invalide format");
            }

            File file = File.fromChar(fileChar);
            if (file == null) {
                System.out.println("Invalide format");
                continue;
            }

            return new Coordinates(file, rank);
        }
    }

    public static void main(String[] args) {
        Coordinates coordinates = input();
        System.out.println(coordinates);
    }
}
