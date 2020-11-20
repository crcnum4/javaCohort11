package DiceGames;

import java.util.ArrayList;
import java.util.List;
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

    static public List<Integer> getChoices() {
        List<Integer> choices = new ArrayList<>();
        // TODO: get the choices
        System.out.println("Which dice do you want to reroll?");
        String input = scanner.nextLine(); // "2 4 5"
        String[] inputArray = input.split(" "); // ["2", "4", "5"] -> <2, 4, 5>
        for (String number : inputArray) {
            choices.add(Integer.parseInt(number) - 1);
        }

        return choices;
    }
}
