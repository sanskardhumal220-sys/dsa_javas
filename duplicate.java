import java.util.Arrays;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 1. Correct class to sort arrays in Java
        Arrays.sort(nums); 
        
        // 2. Correct syntax for array length is nums.length
        for (int i = 0; i < nums.length - 1; i++) { 
            // 3. Check if adjacent elements are exactly the same
            if (nums[i] == nums[i + 1]) { 
                return true;
            }
        }
        
        // 4. Return false outside the loop if no duplicates are found
        return false; 
    }
}
