public class Set3Prog3 {
    public static void runA() {
        System.out.println(weaveStrings("hi", "kebob"));
    }

    private static String weaveStrings(String s1, String s2) {
        return s2 + s1 + s2 + s1;
    }


    public static void runB() {
        System.out.println(sameLastLetter("blink", "sink"));
        System.out.println(sameLastLetter("lobster", "sink"));
        System.out.println(sameLastLetter("", "hello"));
    }
    private static boolean sameLastLetter(String s1, String s2) {
        if (s1.length() == 0 || s2.length() == 0 || !s1.substring( s1.length() - 1 ).equals( s2.substring( s2.length() - 1 ) ) ) {
            return false;
        }
        return true;
    }


    public static void runC() {
        doubleDisplay("hey");
        doubleDisplay("a b");
    }

    private static void doubleDisplay(String s) {
        for (int i = 0; i < s.length() ; i++) {
            System.out.print(s.substring(i, i+1) + s.substring(i, i+1));
        }
        System.out.println();
    }


    public static void runD() {
        insert("Hello there", "-");
        insert("aaaa", "**");
    }

    private static void insert(String s1, String s2) {
        for (int i = 0; i < s1.length()-1; i++) {
            System.out.print( s1.substring(i, i+1) + s2 );
        }
        System.out.println( s1.substring( s1.length() - 1 ) );
    }


    public static void runE() {
        System.out.println( countLetter("a", "hay is for horses") );	// returns 1 because there is only 1 letter "a"
        System.out.println( countLetter("h", "hay is for horses") );      // returns 2 because there are 2 letter "h"s
    }

    private static int countLetter(String s1, String s2) {
        int counter = 0;
        for (int i = 0; i < s2.length(); i++) {
            if ( s2.substring(i, i+1).equals(s1) ) {
                counter++;
            }
        }
        return counter;
    }


    public static void runF() {
        weave2("hi", "there");		// displays nothing, because strings aren’t the same length
        weave2("aaaa", "bbbb");		// displays  abababab	alternating the a’s and b’s
        weave2("pizza", "kebob");	// displays  pkiezbzoab
    }

    private static void weave2(String s1, String s2) {
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                System.out.print( s1.substring(i, i+1) + s2.substring(i, i+1));
            }
            System.out.println();
        }
    }
}
