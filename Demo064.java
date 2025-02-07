public class Demo064 {
    public static void main(String[] args) {
        
        int[] arr = {10, 20, 30, 40, 50};

        System.out.println("Original Array: ");
        printArray(arr);

        
        if (arr.length > 1) {
           
            int temp = arr[0];
            arr[0] = arr[arr.length - 1];
            arr[arr.length - 1] = temp;

           
            System.out.println("Array after swapping 1st and last elements: ");
            printArray(arr);
        } else {
            System.out.println("Array does not have enough elements to swap.");
        }
    }

    
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
