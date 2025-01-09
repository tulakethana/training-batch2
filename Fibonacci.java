public class Fibonacci {

    public static String getFibonacciSeries(int n) {
        // If input is zero or negative, return "0"
        if (n <= 0) {
            return "0";
        }

        // Variables to store the Fibonacci sequence
        int a = 0, b = 1;
        StringBuilder result = new StringBuilder();

        // Generate Fibonacci sequence for 'n' terms
        for (int i = 0; i < n; i++) {
            if (i > 0) {
                result.append(", ");
            }
            result.append(a); // Add the current number to the result

            // Update 'a' and 'b' for next Fibonacci number
            int next = a + b;
            a = b;
            b = next;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Test with some inputs
        int n1 = 4;
        System.out.println(getFibonacciSeries(n1)); // Expected: 0,1,1,2

        int n2 = 7;
        System.out.println(getFibonacciSeries(n2)); // Expected: 0,1,1,2,3,5,8

        int n3 = 0;
        System.out.println(getFibonacciSeries(n3)); // Expected: 0

        int n4 = -5;
        System.out.println(getFibonacciSeries(n4)); // Expected: 0
    }
}
