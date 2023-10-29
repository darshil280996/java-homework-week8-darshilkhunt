import java.util.Scanner;

/*
Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
-Before the user enters the number, print the message Enter number:
-If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
Hint:
-Use an endless while loop.
-Create a class with the name MinAndMaxInputChallenge.
 */

public class Program2_MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Enter number: ");

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number < min) {
                    min = number;
                }
                if (number > max) {
                    max = number;
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }

            scanner.nextLine();
        }

        System.out.println("Minimum Number: " + min);
        System.out.println("Maximum Number: " + max);

        scanner.close();
    }
}
