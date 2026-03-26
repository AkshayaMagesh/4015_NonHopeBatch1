package day_6_task;
import java.util.*;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length && nums[i] <= 0)
            i++;
        int ctr = 1;
        for(i=i; i < nums.length; i++) {
            if(nums[i] > ctr){
                return ctr;
            }
            else if(nums[i] == ctr) {
                ctr++;
            }
        }
        return ctr;
    }
}