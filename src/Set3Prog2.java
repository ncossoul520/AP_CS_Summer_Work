public class Set3Prog2 {
    public static void runA() {
        System.out.println( max( randNum(100), randNum(100), randNum(100) ) );
        System.out.println( max( randNum(100), randNum(100), randNum(100), randNum(100) ) );
    }

    private static int max(int num1, int num2, int num3) {
        System.out.println("finding the max of: " + num1 + " " + num2 + " " + num3);
        return Math.max(num1, (Math.max(num2, num3)));
    }

    private static int max(int num1, int num2, int num3, int num4) {
        System.out.println("finding the max of: " + num1 + " " + num2 + " " + num3 + " " + num4);
        return Math.max( Math.max(num1, num2), Math.max(num3, num4) );
    }

    private static int randNum(int max) {
        return (int)(Math.random()*max + 1);
    }


    public static void runB() {
        int num = randNum(100);
        System.out.println("Number: " + num + " Number of factors: " + countFactors(num));
    }

    public static int countFactors(int num) {
        int counter = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                counter++;
            }
        }
        return counter;
    }


    public static void runC() {
        for (int n = 2; n < 10000; n++) {
            if ( isPrime(n) == true) {
                System.out.println(n + " is prime!");
            }
        }
    }

    private static boolean isPrime(int n) {
        return countFactors(n) == 2;
    }


    public static void runD() {
        int num = 999999;
        int p = findPrimeLargerThan(num);
        System.out.println("First prime larger than " + num + " is " + p );
    }

    private static int findPrimeLargerThan(int num) {
        do {
            num++;
        } while ( !isPrime(num) );
        return num;
    }
}
