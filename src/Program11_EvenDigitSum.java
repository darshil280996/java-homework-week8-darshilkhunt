/*
Even Digit Sum

Write a method named getEvenDigitSum with one parameter of type int called number.
The method should return the sum of the even digits within the number.
If the number is negative, the method should return -1 to indicate an invalid value.
EXAMPLE INPUT/OUTPUT:
* getEvenDigitSum(123456789); → should return 20 since 2 + 4 + 6 + 8 = 20
* getEvenDigitSum(252); → should return 4 since 2 + 2 = 4
* getEvenDigitSum(-22); → should return -1 since the number is negative
NOTE: The method getEvenDigitSum should be defined as public static
 */

import java.util.Scanner;

public class Program11_EvenDigitSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int evenDigitSum = getEvenDigitSum(number);

        if (evenDigitSum == -1) {
            System.out.println("Invalid Input. Please enter a positive number. ");
        } else {
            System.out.println("Sum of even digits: " + evenDigitSum);
        }

        scanner.close();
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1; // Return -1 for negative numbers
        }

        int evenDigitSum = 0;

        while (number > 0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                evenDigitSum += digit;
            }

            number /= 10;
        }

        return evenDigitSum;
    }
}
