public class Set7Prog2 {
    public static void run() {
        displayCountingRectangle(2);
        displayCountingRectangle(3);
        displayCountingRectangle(4);
    }

    private static void displayCountingRectangle(int maxNum) {
        for (int row = 0; row <= maxNum; row++) {
            for (int col = 0; col < maxNum*2+1; col++) {
                if (col <= maxNum) {
                    System.out.print(row + col + " " );
                } else {
                    System.out.print(row + maxNum*2 - col + " ");
                }
            }
            System.out.println();
        }
    }
}
