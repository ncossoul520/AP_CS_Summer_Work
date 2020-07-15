public class Set2Prog0 {
    public static void run() {
        for (int i = 20; i <= 100 ; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("WONK");
            } else if (i % 2 == 0) {
                System.out.println("*" + i);
            } else if (i % 3 == 0) {
                System.out.println(i + " hi");
            } else {
                System.out.println(i);
            }
        }
    }
}
