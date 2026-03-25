package day_4_task;

import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i <nums.length; i++){
            if(set.contains(nums[i]) == true) return true;
            set.add(nums[i]);
        }
        return false;
    }
}