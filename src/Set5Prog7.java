import java.util.Arrays;

public class Set5Prog7 {
    public static void run() {
        int[] a = new int[] {0,1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString( shuffle( a ) ));
    }

    private static int[] shuffle(int[] a) {
        for (int i = a.length-1; i > 0; i--) {
            a = swap( a, i, (int)(Math.random()*(i+1) ) );
        }
        return a;
    }

    private static int[] swap(int[] a, int i1, int i2) {
//        System.out.println("Swapping " + i1 + " and " + i2);
        if (i1 == i2) {
            return a;
        }
        int temp = a[i1];
        a[i1] = a[i2];
        a[i2] = temp;
        return a;
    }
}
