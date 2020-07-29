import java.util.Arrays;

public class Set5Prog2 {
    public static void run() {
        String[] names = {"abadaba", "behemoth", "carlheinz", "doctorow"};
        String[] adjs = {"the fallow", "the somewhat large", "the incredibly hungry", "the bemused"};

        String[] phrases = new String[100];
        for (int i = 0; i < phrases.length; i++) {
            phrases[i] = names[(int)(Math.random()*names.length)] + " " + adjs[(int)(Math.random()*adjs.length)];
        }
        System.out.println(Arrays.toString( phrases ));
    }
}
