package DiceGames;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rand = new Random();
        Hand myHand = new Hand(5);
        myHand.roll(rand);
        System.out.println(myHand);
        myHand.roll(rand);
        System.out.println(myHand);
        myHand.roll(rand);
        System.out.println(myHand);
    }
}
