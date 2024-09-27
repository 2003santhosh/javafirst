import java.util.Scanner;

public class AdditionCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform addition
        double sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);

        // Close the scanner
        scanner.close();

        System.out.println(100);
        System.out.println(100);

    }
}
