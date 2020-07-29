import java.util.ArrayList;
import java.util.Arrays;

public class Set5Prog0 {
    public static void runA() {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10 + 1);
        }
        System.out.println(Arrays.toString( arr ));
    }


    public static void runB() {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            arr.add( (int)(Math.random()*10 + 1) );
        }
        System.out.println(arr);
    }
}
