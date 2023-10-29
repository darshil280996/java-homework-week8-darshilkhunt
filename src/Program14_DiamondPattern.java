import java.util.Scanner;

/*
Write a program in Java to display the pattern like a diamond.
While loop
*
***
*****
*******
*********
***********
*************
***********
*********
*******
*****
***
*
*/
public class Program14_DiamondPattern {

    public static void printDiamond(int numRows) {
        int spaces = numRows / 2;
        int stars = 1;

        while (stars <= numRows) {
            for (int i = 0; i < spaces; i++) {
                System.out.println(" ");
            }

            for (int j = 0; j < stars; j++) {
                System.out.println("*");
            }

            System.out.println();

            if (stars < numRows) {
                spaces--;
                stars += 2;
            } else {
                spaces++;
                stars -= 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the diamond: ");
        int numRows = scanner.nextInt();

        if (numRows % 2 == 0) {
            System.out.println("Please enter an odd number of rows.");
        } else {
            printDiamond(numRows);
        }

        scanner.close();
    }
}
