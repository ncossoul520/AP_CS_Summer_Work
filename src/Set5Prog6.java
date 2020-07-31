import sun.font.FontRunIterator;

import java.util.ArrayList;
import java.util.Arrays;

public class Set5Prog6 {
    public static void runA() {
        String[] arr1 = new String[] {"blue", "green", "red"};
        String[] arr2 = new String[] {"blue", "green", "red"}; // same as arr1
        String[] arr3 = new String[] {"blue", "green", "red", "yellow"}; // same as arr1 but 1 more element
        String[] arr4 = new String[] {"blue", "red", "green"}; // different than arr1 but same size

        System.out.println( areEqual(arr1, arr2) + " arr1:" + Arrays.toString(arr1) + " arr2:" + Arrays.toString(arr2) ); // true
        System.out.println( areEqual(arr1, arr3) + " arr1:" + Arrays.toString(arr1) + " arr3:" + Arrays.toString(arr3) ); // false
        System.out.println( areEqual(arr1, arr4) + " arr1:" + Arrays.toString(arr1) + " arr4:" + Arrays.toString(arr4) ); // false
    }

    public static boolean areEqual(String[] a, String[] b) {
        // if a and b aren’t the same length, return false
        if (a.length != b.length) {
            return false;
        }

        // loop over all indexes for a
        // if corresponding values for a and b aren’t the same, return false
        for (int i = 0; i < a.length; i++) {
            if ( !a[i].equals(b[i]) ) {
                return false;
            }
        }

        // return true at the end if we haven’t returned false yet.
        return true;
    }



    public static void runB() {
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        ArrayList<String> arr3 = new ArrayList<>();
        ArrayList<String> arr4 = new ArrayList<>();

        arr1.add("blue");
        arr1.add("green");
        arr1.add("red");

        arr2.add("blue");
        arr2.add("green");
        arr2.add("red");

        arr3.add("blue");
        arr3.add("green");
        arr3.add("red");
        arr3.add("yellow");

        arr4.add("blue");
        arr4.add("red");
        arr4.add("green");

        System.out.println( areEqual(arr1, arr2) + " arr1:" + arr1 + " arr2:" + arr2 ); // true
        System.out.println( areEqual(arr1, arr3) + " arr1:" + arr1 + " arr3:" + arr3 ); // false
        System.out.println( areEqual(arr1, arr4) + " arr1:" + arr1 + " arr4:" + arr4 ); // false
    }

    public static boolean areEqual(ArrayList<String> a, ArrayList<String> b) {
        // if a and b aren’t the same length, return false
        if (a.size() != b.size()) {
            return false;
        }

        // loop over all indexes for a
        // if corresponding values for a and b aren’t the same, return false
        for (int i = 0; i < a.size(); i++) {
            if ( !a.get(i).equals(b.get(i)) ) {
                return false;
            }
        }

        // return true at the end if we haven’t returned false yet.
        return true;
    }

}
