import java.util.ArrayList;
import java.util.Arrays;

public class Set5Prog4 {
    public static void runA() {
        int[] nums_no2no5 = new int[] { 0, 1, 3, 4, 6, 7, 8, 9, 10 };
        int[] nums_2no5 = new int[] { 0, 1, 2, 3, 4, 6, 7, 8, 9, 10 };
        int[] nums_no2_5 = new int[] { 0, 1, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] nums_2_5 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println( doesntContain2or5( nums_no2no5 ) + " " + Arrays.toString( nums_no2no5 ));
        System.out.println( doesntContain2or5( nums_2no5   ) + " " + Arrays.toString( nums_2no5 ));
        System.out.println( doesntContain2or5( nums_no2_5  ) + " " + Arrays.toString( nums_no2_5 ));
        System.out.println( doesntContain2or5( nums_2_5    ) + " " + Arrays.toString( nums_2_5 ));
    }

    public static boolean doesntContain2or5(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2 || nums[i] == 5) {
                return false;
            }
        }
        return true;
    }


    public static void runB() {
        ArrayList<Integer> nums_no2no5 = new ArrayList<>();
        ArrayList<Integer> nums_2no5 = new ArrayList<>();
        ArrayList<Integer> nums_no2_5 = new ArrayList<>();
        ArrayList<Integer> nums_2_5 = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            if (i == 2) {
                nums_2no5.add(i);
                nums_2_5.add(i);
            } else if (i == 5) {
                nums_2_5.add(i);
                nums_no2_5.add(i);
            } else {
                nums_no2no5.add(i);
                nums_2no5.add(i);
                nums_no2_5.add(i);
                nums_2_5.add(i);
            }
        }

        System.out.println( doesntContain2or5( nums_no2no5 ) + " " + nums_no2no5 );
        System.out.println( doesntContain2or5( nums_2no5   ) + " " + nums_2no5 );
        System.out.println( doesntContain2or5( nums_no2_5  ) + " " + nums_no2_5 );
        System.out.println( doesntContain2or5( nums_2_5    ) + " " + nums_2_5 );
    }

    public static boolean doesntContain2or5(ArrayList<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == 2 || nums.get(i) == 5) {
                return false;
            }
        }
        return true;
    }

}

