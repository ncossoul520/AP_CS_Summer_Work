public class Set3Prog1 {
    public static void  runA() {
        System.out.println( findMax( randNum(100), randNum(100), randNum(100)) );
    }

    private static int findMax(int num1, int num2, int num3) {
        System.out.println("finding the max of: " + num1 + " " + num2 + " " + num3);
        return Math.max(num1, (Math.max(num2, num3)));
    }

    private static int randNum(int max) {
        return (int)(Math.random()*max + 1);
    }


    public static void runB() {
        System.out.println( findAverage( randNum(100), randNum(100), randNum(100), randNum(100)));
    }

    private static double findAverage(int num1, int num2, int num3, int num4) {
        System.out.println("finding the average of: " + num1 + " " + num2 + " " + num3 + " " + num4);
        return (num1 + num2 + num3 + num4) / 4.0;
    }


    public static void runC() {
        displayNTimes("Bird", 3);
    }

    private static void displayNTimes(String msg, int num) {
        for (int i = 0; i < num; i++) {
            System.out.print(msg);
        }
        System.out.println();
    }


    public static void runD() {
        String msg = getRepeatedMessage("Bird", 5);
        System.out.println(msg);
    }

    private static String getRepeatedMessage(String msg, int num) {
        String res = "";
        for (int i = 0; i < num; i++) {
            res = res + msg;
        }
        return res;
    }
}