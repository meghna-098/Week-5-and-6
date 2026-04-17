// Import Scanner class for user input
import java.util.Scanner;

// Creating class NumberAnalyzer
class NumberAnalyzer {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare array to store 5 numbers
        int[] numbers = new int[5];

        // Take input from user
        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Analyze each number
        System.out.println("\nNumber Analysis:");

        for (int i = 0; i < numbers.length; i++) {

            int num = numbers[i];

            // Check if positive
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            }
            // Check if negative
            else if (num < 0) {
                System.out.println(num + " is Negative");
            }
            // Check if zero
            else {
                System.out.println(num + " is Zero");
            }
        }

        // Compare first and last elements
        int first = numbers[0];
        int last = numbers[numbers.length - 1];

        System.out.println("\nComparison of first and last elements:");

        if (first == last) {
            System.out.println("First and last elements are Equal");
        } else if (first > last) {
            System.out.println("First element is Greater than last element");
        } else {
            System.out.println("First element is Less than last element");
        }

        // Close scanner
        input.close();
    }
}