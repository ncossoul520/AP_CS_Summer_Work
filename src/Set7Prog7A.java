import java.util.Arrays;

public class Set7Prog7A {
    public static void run() {
        int[] arr_true   = new int[] {1, 3, 5, 8};
        int[] arr_false1 = new int[] {1, 3, 2, 8};
        int[] arr_false2 = new int[] {1, 1, 5, 8};

        System.out.println("Array: " + Arrays.toString(arr_true) + " is increasing: " + isIncreasingArray(arr_true));
        System.out.println("Array: " + Arrays.toString(arr_false1) + " is increasing: " + isIncreasingArray(arr_false1));
        System.out.println("Array: " + Arrays.toString(arr_false2) + " is increasing: " + isIncreasingArray(arr_false2));
    }

    private static boolean isIncreasingArray(int[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] >= arr[i+1]) {
                return false;
            }
        }
        return true;
    }
}
