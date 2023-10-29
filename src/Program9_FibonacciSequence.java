import java.util.Scanner;

/*
 Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class Program9_FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci sequence");
        int numTerms = scanner.nextInt();

        if (numTerms < 1) {
            System.out.println("Please enter a positive number of terms");
        } else {
            printFibonacciSequence(numTerms);
        }

        scanner.close();
    }

    public static void printFibonacciSequence(int numTerms) {
        int firstTerm = 1;
        int secondTerm = 1;

        if (numTerms >= 1) {
            System.out.println(firstTerm);
        }

        if (numTerms >= 2) {
            System.out.println("  " + secondTerm);
        }

        for (int i = 3; i <= numTerms; i++) {
            int nextTerm = firstTerm + secondTerm;
            System.out.println(" " + nextTerm);
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

        System.out.println();
    }
}
