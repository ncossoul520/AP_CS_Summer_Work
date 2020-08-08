public class Set7Prog3 {
    public static void run() {
        String result = returnRectangle(2, 3, "a");
        System.out.println(result);
        result = returnRectangle(3, 1, "*");
        System.out.println(result);
    }

    private static String returnRectangle(int height, int width, String letter) {
        String result = "";
        for (int h = 0; h < height; h++) {
            for (int w = 0; w < width; w++) {
                result += letter + " ";
            }
            result += "\n";
        }
        return result;
    }
}
