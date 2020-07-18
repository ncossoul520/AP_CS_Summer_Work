import javax.swing.*;

public class Set2Prog5 {
    public static void run() {

        int num = Integer.parseInt( JOptionPane.showInputDialog("Pick a positive number" ));

        for (int i = 0; i < num; i++) {
            for (int j = num-i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
