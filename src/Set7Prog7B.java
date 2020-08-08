public class Set7Prog7B {
    public static void run() {
        System.out.println(neighborsSumTo10( new int[] {1, 2, 7, 1, 4  }  ));   // returns true because 2+7+1 = 10
        System.out.println(neighborsSumTo10( new int[] {1, 4, 2, 7, 5, 1  }  )); // returns false because no 3-in-a-row sum to 10
    }

    private static boolean neighborsSumTo10(int[] arr) {
        for (int i = 0; i < arr.length - 3; i++) {
            if (arr[i] + arr[i+1] + arr[i+2] == 10) {
                return true;
            }
        }
        return false;
    }
}
