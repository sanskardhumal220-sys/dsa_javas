class Solution {
    public int missingNumber(int[] nums) {

        int missingno = nums.length;
        int i = 0;

        for (int num : nums) {
            missingno = missingno ^ i ^ num;
            i++;
        }

        return missingno;
    }
}