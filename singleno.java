class Solution {
    public int singleNumber(int[] nums) {
        int results = 0;
        for (int num : nums){
           results = results ^ num;
        }
        return results;
    }}