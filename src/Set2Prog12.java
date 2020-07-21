import javax.swing.*;

public class Set2Prog12 {
    public static void run() {

        int n = Integer.parseInt( JOptionPane.showInputDialog("Enter a number") );
        int num = (2*n + 1);

        for (int i = 0; i < num ; i++) {
            for (int j = 0; j < num ; j++) {
                if (i == j || i == num - 1 - j) {
                    System.out.print("* ");
                } else {
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
