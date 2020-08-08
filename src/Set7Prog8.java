import java.util.ArrayList;
import java.util.Arrays;

public class Set7Prog8 {
    public static void runA() {
        int[] a = new int[] {0, 1, 2, 3};
        int[] b = new int[] {4, 5, 6, 7, 8};

        System.out.println( combineArrays(a, b) );
    }

    private static ArrayList<Integer> combineArrays(int[] a, int[] b) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int val : a) {
            res.add(val);
        }
        for (int val : b) {
            res.add(val);
        }
        return res;
    }


    public static void runB() {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i <= 8; i++) {
            if (i < 4) {
                a.add(i);
            } else {
                b.add(i);
            }
        }

        System.out.println( Arrays.toString( combineArrays(a, b)) );
    }

    private static int[] combineArrays( ArrayList<Integer> a, ArrayList<Integer> b ) {
        int[] res = new int[a.size() + b.size()];
        for (int i = 0; i < a.size(); i++) {
            res[i] = a.get(i);
        }
        for (int i = 0; i < b.size(); i++) {
            res[a.size()+i] = b.get(i);
        }
        return res;
    }
}
