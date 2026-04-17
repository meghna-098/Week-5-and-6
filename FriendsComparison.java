import java.util.Scanner;

// Class to find youngest and tallest among friends
class FriendsComparison {

    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Array to store names of friends
        String[] names = {"Amar", "Akbar", "Anthony"};

        // Arrays to store ages and heights
        int[] ages = new int[3];
        double[] heights = new double[3];

        // Input ages and heights
        for (int i = 0; i < names.length; i++) {
            System.out.println("\nEnter details for " + names[i]);

            System.out.print("Enter age: ");
            ages[i] = input.nextInt();

            System.out.print("Enter height: ");
            heights[i] = input.nextDouble();
        }

        // Assume first person is youngest and tallest initially
        int youngestIndex = 0;
        int tallestIndex = 0;

        // Loop to find youngest and tallest
        for (int i = 1; i < names.length; i++) {

            // Check for youngest (minimum age)
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }

            // Check for tallest (maximum height)
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("\n--- Result ---");
        System.out.println("Youngest Friend: " + names[youngestIndex] +
                           " (Age: " + ages[youngestIndex] + ")");

        System.out.println("Tallest Friend: " + names[tallestIndex] +
                           " (Height: " + heights[tallestIndex] + ")");

        // Close scanner
        input.close();
    }
}