/*
Display right angle triangle of @ using nested for loops
@
@@
@@@
@@@@
@@@@@
 */

import java.util.Scanner;

public class Program8_RightAngleTriangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int numRows = scanner.nextInt();

        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
        scanner.close();
    }
}
