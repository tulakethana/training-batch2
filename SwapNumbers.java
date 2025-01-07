import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Read two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Swap without using a temporary variable (Arithmetic method)
        num1 = num1 + num2;  // Sum of both numbers
        num2 = num1 - num2;  // Subtract the new num1 to get original num1
        num1 = num1 - num2;  // Subtract the new num2 to get original num2

        // Output the swapped values
        System.out.println("After swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        scanner.close();
    }
}
