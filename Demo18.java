import java.util.Scanner;

public class Demo18 {

    public static void convertMinutes(long minutes) {
        // Constants
        final long MINUTES_IN_A_DAY = 1440; // 1 day = 1440 minutes
        final long MINUTES_IN_A_MONTH = 43200; // 1 month = 30 days = 43200 minutes
        final long MINUTES_IN_A_YEAR = 525600; // 1 year = 365 days = 525600 minutes

        // Calculate years, months, and days
        long years = minutes / MINUTES_IN_A_YEAR;
        minutes %= MINUTES_IN_A_YEAR; // Remaining minutes after years calculation

        long months = minutes / MINUTES_IN_A_MONTH;
        minutes %= MINUTES_IN_A_MONTH; // Remaining minutes after months calculation

        long days = minutes / MINUTES_IN_A_DAY;

        // Print the result
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);
    }

    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the number of minutes
        System.out.print("Enter the number of minutes: ");
        long minutes = scanner.nextLong();
        
        // Call the conversion method
        convertMinutes(minutes);
    }
}
