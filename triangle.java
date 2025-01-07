import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the base and height of the triangle
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate the area of the triangle (A = 1/2 * base * height)
        double area = 0.5 * base * height;

        // Display the result
        System.out.printf("The area of the triangle with base %.2f and height %.2f is: %.2f%n", base, height, area);

        // Close the scanner object to avoid resource leaks
        scanner.close();
    }
}
