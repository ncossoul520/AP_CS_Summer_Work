import java.util.ArrayList;
import java.util.Arrays;

public class Set5Prog5 {
    public static void runA() {
        String[] names_false = new String[] {"rabbit", "frog", "squid", "frog"};
        String[] names_true = new String[] {"frog", "squid", "squid", "rabbit"};

        System.out.println( duplicateNeighbor(names_false) + " " + Arrays.toString(names_false));
        System.out.println( duplicateNeighbor(names_true) + " " + Arrays.toString(names_true));
    }

    public static boolean duplicateNeighbor(String[] names) {
        for (int i = 0; i < names.length-1; i++) {
            if (names[i].equals( names[i+1] )) {
                return true;
            }
        }
        return false;
    }


    public static void runB() {
        ArrayList<String> names_false = new ArrayList<>(); //"rabbit", "frog", "squid", "frog"
        ArrayList<String> names_true = new ArrayList<>(); //"frog", "squid", "squid", "rabbit"
        
        names_false.add("rabbit");
        names_false.add("frog");
        names_false.add("squid");
        names_false.add("frog");
        names_true.add("frog");
        names_true.add("squid");
        names_true.add("squid");
        names_true.add("rabbit");

        System.out.println( duplicateNeighbor(names_false) + " " + names_false );
        System.out.println( duplicateNeighbor(names_true) + " " + names_true);
    }

    public static boolean duplicateNeighbor(ArrayList<String> names) {
        for (int i = 0; i < names.size()-1; i++) {
            if (names.get(i).equals( names.get(i+1) )) {
                return true;
            }
        }
        return false;
    }

}
