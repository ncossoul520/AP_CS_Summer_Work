public class Set2Prog4 {

    public static void runA() {
    /*

    0
    0 1
    0 1 2
    0 1 2 3

     */
    }

    public static void runB() {

        for (int i = 0; i < 5; i++) {			// i goes from 0 to 4
            for (int j = 0; j < i; j++) {		// display j from 0 to i-1
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void runC() {

        for (int i = 4; i >= 0; i--) {
            for (int j = i; j >= 0; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void runD() {

        int numZeros = 4;

        for (int i = 0; i < 5; i++) {			// i goes from 0 to 4
            for (int j = i; j >= 0; j--) {		// display j from 0 to i-1
                System.out.print(j + " ");
            }

            for (int k = 0; k < numZeros; k++) {
                System.out.print("0 ");
            }

            numZeros--;
            System.out.println();
        }

    }

}
