package CardGame;

import java.util.Scanner;

public class RiggedDeck implements Deck {

    final private String[] SUITS = {"♤", "♥", "♧", "♦"};

    public void shuffle() {
        return;
    }

    public Card draw() {
        Console console = new Console();
        int value = console.getNumber("What Card value 1 - 13", 1, 13);
        int suit = console.getNumber("What Suit 1 - 4", 1, 4);
        return new Card(value, SUITS[suit - 1]);
    }
}
