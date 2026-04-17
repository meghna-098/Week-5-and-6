import java.util.Scanner;

// Class to find frequency of each digit in a number
class DigitFrequency {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store original number for display
        int originalNumber = number;

        // Step 1: Count digits
        int temp = number;
        int digitCount = 0;

        while (temp != 0) {
            temp = temp / 10;
            digitCount++;
        }

        // Handle case when number is 0
        if (number == 0) {
            digitCount = 1;
        }

        // Step 2: Store digits in array
        int[] digits = new int[digitCount];
        int index = 0;

        while (number != 0) {
            digits[index] = number % 10;
            number = number / 10;
            index++;
        }

        // Special case for 0
        if (originalNumber == 0) {
            digits[0] = 0;
        }

        // Step 3: Frequency array (0–9 digits)
        int[] frequency = new int[10];

        // Count frequency of each digit
        for (int i = 0; i < digitCount; i++) {
            int digit = digits[i];
            frequency[digit]++;
        }

        // Step 4: Display result
        System.out.println("\nDigit Frequency in " + originalNumber + ":");

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " occurs " + frequency[i] + " times");
            }
        }

        // Close scanner
        input.close();
    }
}