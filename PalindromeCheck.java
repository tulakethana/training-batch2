import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Input: Read a string from the user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to lowercase to make the check case-insensitive
        input = input.toLowerCase();

        // Remove any non-alphanumeric characters (spaces, punctuation)
        input = input.replaceAll("[^a-zA-Z0-9]", "");

        // Check if the string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        // Close the scanner to avoid resource leaks
        scanner.close();
    }

    // Function to check if the string is a palindrome
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        // Check for characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false; // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }

        return true; // If we complete the loop without mismatches, it's a palindrome
    }
}
