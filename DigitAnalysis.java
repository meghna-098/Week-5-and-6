import java.util.Scanner;

// Class to store digits in array and find largest & second largest
class DigitAnalysis {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input for number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define max size for digits array
        int maxDigit = 10;

        // Array to store digits
        int[] digits = new int[maxDigit];

        // Index to track position in array
        int index = 0;

        // Store original number for display
        int originalNumber = number;

        // Extract digits and store in array
        while (number != 0) {

            // Get last digit
            int digit = number % 10;

            // Store digit in array
            digits[index] = digit;

            // Increment index
            index++;

            // Remove last digit
            number = number / 10;

            // Stop if array is full
            if (index == maxDigit) {
                break;
            }
        }

        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        // Loop through stored digits
        for (int i = 0; i < index; i++) {

            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } 
            else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display digits
        System.out.print("Digits stored: ");
        for (int i = 0; i < index; i++) {
            System.out.print(digits[i] + " ");
        }

        // Display results
        System.out.println("\nLargest digit = " + largest);

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("Second largest digit not found (all digits same or single digit)");
        } else {
            System.out.println("Second largest digit = " + secondLargest);
        }

        // Close scanner
        input.close();
    }
}