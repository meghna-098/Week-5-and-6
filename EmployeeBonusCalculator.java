import java.util.Scanner;

// Class to calculate bonus for 10 employees
class EmployeeBonusCalculator {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Define arrays to store employee data
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        // Variables to store totals
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to take input for 10 employees
        for (int i = 0; i < salary.length; i++) {

            System.out.println("\nEnter details for Employee " + (i + 1));

            // Input salary with validation
            System.out.print("Enter salary: ");
            salary[i] = input.nextDouble();

            System.out.print("Enter years of service: ");
            yearsOfService[i] = input.nextDouble();

            // Validate input
            if (salary[i] <= 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input! Please re-enter details.");
                i--; // repeat this iteration
                continue;
            }

            // Add to total old salary
            totalOldSalary += salary[i];
        }

        // Loop to calculate bonus and new salary
        for (int i = 0; i < salary.length; i++) {

            // Apply bonus rule
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05; // 5% bonus
            } else {
                bonus[i] = salary[i] * 0.02; // 2% bonus
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonus[i];

            // Add to totals
            totalBonus += bonus[i];
            totalNewSalary += newSalary[i];
        }

        // Display results
        System.out.println("\n--- Employee Bonus Details ---");

        for (int i = 0; i < salary.length; i++) {
            System.out.println("Employee " + (i + 1) +
                    " | Old Salary: " + salary[i] +
                    " | Bonus: " + bonus[i] +
                    " | New Salary: " + newSalary[i]);
        }

        // Display total summary
        System.out.println("\n--- Company Summary ---");
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total Bonus Payout = " + totalBonus);
        System.out.println("Total New Salary = " + totalNewSalary);

        // Close scanner
        input.close();
    }
}