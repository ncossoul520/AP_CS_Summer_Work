public class Set1Prog4 {
    public static void run() {
        for (int i = 0; i < 20; i++) {
            int d1 = (int)(Math.random()*6)+1;
            int d2 = (int)(Math.random()*6)+1;
            System.out.println("Die 1: " + d1 + " Die 2: " + d2 + " Total: " + (d1+d2));
        }
    }
}
