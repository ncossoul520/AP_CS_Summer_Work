public class Set7Prog6 {
    public static void run() {
        String[] arr = new String[] {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
        System.out.println( getRandomPair(arr) );
    }

    private static String getRandomPair(String[] arr) {
        return arr[(int)(Math.random()*arr.length)] + " " + arr[(int)(Math.random()*arr.length)];
    }
}
