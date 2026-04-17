// Import Scanner class for user input
import java.util.Scanner;

// Creating class MultiplicationTableArray
class MultiplicationTableArray {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare variable for number
        int number;

        // Take input from user
        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Declare array to store multiplication results (1 to 10)
        int[] table = new int[10];

        // Fill the array with multiplication values
        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
        }

        // Display the multiplication table
        System.out.println("\nMultiplication Table:");

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }

        // Close scanner
        input.close();
    }
}