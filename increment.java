public class increment {
    public static void main(String[] args) {
        int num = 5;
        
        // Postfix Increment (First, use the value, then increment)
        System.out.println("Postfix Increment: " + num++); // Output: 5
        System.out.println("After Postfix Increment: " + num); // Output: 6

        // Prefix Increment (First, increment, then use the value)
        System.out.println("Prefix Increment: " + ++num); // Output: 7
    }
}
