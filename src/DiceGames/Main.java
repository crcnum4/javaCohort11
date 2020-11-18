package DiceGames;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Hand myHand = new Hand(5);

        Console.welcome();
        myHand.roll(rand);
        System.out.println(myHand);
        myHand.roll(rand, Console.getChoice());
        System.out.println(myHand);
        myHand.roll(rand, Console.getChoice());
        System.out.println(myHand);
    }
}
