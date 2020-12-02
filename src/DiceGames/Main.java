package DiceGames;

import com.company.DnaSystem;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(simpleRansom("hello", "ablocd achdle"));
    }


    public static boolean simpleRansom(String message, String source) {
        HashMap<String, Integer> letterCount = new HashMap<>();
        String[] sourceArray = source.split("");
        for (var letter : sourceArray) {
            System.out.println(letterCount);
            if (letter.equals(" ")) {
                continue;
            }

            if (letterCount.containsKey(letter)) {
                letterCount.replace(letter, letterCount.get(letter) + 1);
                continue;
            }

            letterCount.put(letter, 1);


        }



        String[] messageArray = message.split("");
        for (var letter : messageArray) {
            System.out.println(letter);
            System.out.println(letterCount);
            if (!letterCount.containsKey(letter)) return false;

            if (letterCount.get(letter) == 0) return false;

            /* letter is in the letterCount and there is at least 1 */
            letterCount.replace(letter, letterCount.get(letter) - 1);
        }

        return true;
    }

    /* hello world || ehwni ellawo eiwnd iwr */
    /* e: 2, h: 0, w: 3, n:2, i:3, l: 0, a:1, o: 0, d: 1, r: 1 */
    /* h: 1, e: 1, l:3, o: 2, w: 1, r: 1, d: 1     */


}
