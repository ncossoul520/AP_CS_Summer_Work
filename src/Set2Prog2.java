public class Set2Prog2 {
    private static int n;

    public static void runA() {

        for (int i = 0; i < 10; i++) {
            n = (int) (Math.random() * 4 - 1); // -1, 0, 1, 2
            System.out.print("i: " + i);

            if (n <= 0) {
                doSomethingWith(n);
            }

            if (!runTest()) {
                doSomethingWith(n);
            }
            System.out.println();
        }
    }

    private static boolean runTest() {
        return (n%2 == 0);
    }

    private static void doSomethingWith(int n) {
        System.out.print(" n equals: " + n);
    }

    public static void runB() {
        int x = (int)(Math.random()*2);
        int z;

        method1();
        z = method2(x);
        if (x > 0) {
            x = -x;
        } else {
            x++;
        }

        System.out.println(x + " " + z);
    }

    private static void method1() {
        System.out.println("method1 called");
    }
    private static int method2(int x) {
        return x*10;
    }

    public static void runC() {
        int[] a = new int[9];
        a[0] = 30;
        System.out.println("a[0] = " + a[0]);
        for (int i = 1; i < 9; i++) {
            a[i] = a[i-1] + 10;
            System.out.println("a[" + i + "] = " + a[i]);
        }

    }
}
