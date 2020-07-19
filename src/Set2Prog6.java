public class Set2Prog6 {
    public static void run() {

        int die1, die2, die3;
        int counter = 0;

        do {
            die1 = (int)(Math.random()*6 +1);
            die2 = (int)(Math.random()*6 +1);
            die3 = (int)(Math.random()*6 +1);
            counter++;
            System.out.println( die1 + " " + die2 + " " + die3);
        } while (die1 != 1 || die2 != 1 || die3 != 1 );

        System.out.println("It took " + counter + " time(s) for all 3 die to land on " + die1);

    }
}
