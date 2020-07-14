public class Set1Prog2 {
    public static void runA(double a, double b, double c) {
        System.out.println( triangleArea(a, b, c) );
    }

    public static void runB() {
        runA(30, 40, 50);
        runA(1, 1, 1);
        runA(10, 15, 20);
    }

    private static double triangleArea(double a, double b, double c) {
        double s = (a + b + c)/2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
