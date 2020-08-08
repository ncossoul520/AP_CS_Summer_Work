public class Set7Prog1 {
    public static void runA() {
        for (int x = 5; x <= 50; x=x+5) {
            ellipse(x, 0, 10, 10);
        }
    }

    public static void runB() {
        for (int y = 0; y <= 30; y+=10) {
            for (int x = 0; x <= 30; x+=10) {
                ellipse(x, y, 10, 10);
            }
            System.out.println();
        }
    }

    private static void ellipse(int x, int y, int w, int l) {
        System.out.println(x + " " + y + " " + w + " " + l);
    }

}
