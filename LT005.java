import java.util.HashMap;

public class LT005 {
    
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            
           
            map.put(nums[i], i);
        }
        
       
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) {
        LT005 solution = new LT005();
        
        
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.twoSum(nums1, target1);
        System.out.println("Result: [" + result1[0] + ", " + result1[1] + "]"); 

        
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.twoSum(nums2, target2);
        System.out.println("Result: [" + result2[0] + ", " + result2[1] + "]"); 

        
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.twoSum(nums3, target3);
        System.out.println("Result: [" + result3[0] + ", " + result3[1] + "]"); 
    }
}
