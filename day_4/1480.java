package day_4;

class Solution {
    public int[] runningSum(int[] nums) {
        int rSum = 0;
        for(int i = 0; i < nums.length; i++){
            rSum += nums[i];
            nums[i] = rSum;
        }

        return nums;
    }
}
