package day_15;


class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if(maxSum < sum) {
                maxSum = sum;
            }
            if(sum < 0) {
                sum = 0;
            }
        }

        return maxSum;
    }
}

// Kadane's algorithm
/*

In kadane's algorithm 
- Iterate through the elements
- not useful to carry forth negative sum
    so set sum to 0 if sum < 0
- update the max sum if sum > maxSum
*/
