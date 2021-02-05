package CardGame;

import java.util.Scanner;

public class Console {

    Scanner scanner = new Scanner(System.in);

    public int getNumber(String query, int min, int max) {
        int inputInt;
        do {
            System.out.println(query);
            String input = scanner.nextLine();
            // TODO: try catch block to protect against non number strings.
            inputInt = Integer.parseInt(input);
        } while (inputInt < min || inputInt > max);

        return inputInt;
    }

    public String getString(String query) {
        System.out.println(query);
        return scanner.nextLine();
    }
}
