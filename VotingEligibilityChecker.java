// Import Scanner class for user input
import java.util.Scanner;

// Creating class VotingEligibilityChecker
class VotingEligibilityChecker {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Declare array to store ages of 10 students
        int[] ages = new int[10];

        // Take input for 10 students
        System.out.println("Enter ages of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Check voting eligibility
        System.out.println("\nVoting Eligibility Results:");

        for (int i = 0; i < ages.length; i++) {

            int age = ages[i];

            // Check for invalid age
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            }
            // Check if eligible to vote
            else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            }
            // Otherwise not eligible
            else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }

        // Close scanner
        input.close();
    }
}