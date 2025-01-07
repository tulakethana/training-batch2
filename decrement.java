public class decrement {
    public static void main(String[] args) {
        int num = 7;

        // Postfix Decrement (First, use the value, then decrement)
        System.out.println("Postfix Decrement: " + num--); // Output: 7
        System.out.println("After Postfix Decrement: " + num); // Output: 6

        // Prefix Decrement (First, decrement, then use the value)
        System.out.println("Prefix Decrement: " + --num); // Output: 5
    }
}
