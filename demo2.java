import java.util.Scanner;

public class demo2 {

    public static void main(String[] args) {
        // Create a Scanner object to read input from user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter two numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Find and print the greatest of the two numbers
        if (num1 > num2) {
            System.out.println("The greatest number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("The greatest number is: " + num2);
        } else {
            System.out.println("Both numbers are equal.");
        }

        // Close the scanner
        scanner.close();
    }
}
