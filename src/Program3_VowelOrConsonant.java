import java.util.Scanner;

/*
Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel of Consonant, depending on the user input. If the user input Is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.

For eg:
Input an alphabet: p
Expected Output:
Input letter is Consonant
 */
public class Program3_VowelOrConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input an alphabet: ");
        String input = scanner.nextLine();

        if (input.length() == 1) {
            char ch = input.charAt(0);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.println("Input letter is Vowel");
                } else {
                    System.out.println("Input letter is Consonant");
                }
            } else {
                System.out.println("Invalid Input. Please enter letter between a to z or A to Z");
            }
        } else {
            System.out.println("Invalid Input. Please enter single letter");
        }
    }
}
