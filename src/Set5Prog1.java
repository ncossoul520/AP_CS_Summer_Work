import java.util.ArrayList;
import java.util.Collections;

public class Set5Prog1 {
    public static void run() {
        ArrayList<Integer> deck = new ArrayList<>();  // create a new array list here

        for (int i = 2; i <= 14; i++) {
            for (int j = 0; j < 4; j++) {   // use loops to add 52 of the correct card-values to the deck.
                   deck.add(i);
            }
        }

        System.out.println(deck);
        Collections.shuffle(deck);   	// this is a built-in method which shuffles an ArrayList
        System.out.println(deck);
    }
}
