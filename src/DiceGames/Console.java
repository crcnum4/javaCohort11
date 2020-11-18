package DiceGames;

import java.util.Scanner;

public class Console {
    static Scanner scanner = new Scanner(System.in);

    static public void welcome() {
        System.out.println("Welcome to Yahtzee");
    }

    static public int getChoice() {
        System.out.print("pick a die 1 - 5 to re-roll: ");
        int choice = scanner.nextInt();
        return choice - 1;
    }
}
