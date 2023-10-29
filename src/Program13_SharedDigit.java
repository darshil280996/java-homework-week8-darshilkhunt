/*
 Shared Digit
Write a method named hasSharedDigit with two parameters of type int.
Each number should be within the range of 10 (inclusive) - 99 (inclusive). If one of the numbers is not within the range, the method should return false.
The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.

EXAMPLE INPUT/OUTPUT:
* hasSharedDigit(12, 23); → should return true since the digit 2 appears in both numbers
* hasSharedDigit(9, 99); → should return false since 9 is not within the range of 10-99
* hasSharedDigit(15, 55); → should return true since the digit 5 appears in both numbers
NOTE: The method hasSharedDigit should be defined as public static

 */

public class Program13_SharedDigit {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23)); // Should return true
        System.out.println(hasSharedDigit(9, 99)); // Should return false
        System.out.println(hasSharedDigit(15, 55)); // Should return true
        System.out.println(hasSharedDigit(12, 34)); // Should return false
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (!isValidRange(num1) || !isValidRange(num2)) {
            return false;
        }

        int firstDigit1 = num1 % 10;
        int secondDigit1 = num1 / 10;
        int firstDigit2 = num2 % 10;
        int secondDigit2 = num2 / 10;

        return (firstDigit1 == firstDigit2 || firstDigit1 == secondDigit2 ||
                secondDigit1 == firstDigit2 || secondDigit1 == secondDigit2);
    }

    public static boolean isValidRange(int number) {
        return (number >= 10 && number <= 99);
    }
}
