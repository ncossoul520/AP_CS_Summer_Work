public class Set7Prog4 {
    public static void runAB() {
        int d1, d2;
        do {
            d1 = rollDie();
            d2 = rollDie();
        } while (d1 == 10 || d2 == 10);
        System.out.println(d1 + " " + d2);
    }

    private static int rollDie() {
        return (int)(Math.random()*10+1);
    }
}
