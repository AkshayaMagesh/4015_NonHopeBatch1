package day_4;

class Solution {
    public void moveZeroes(int[] nums) {
        int result[] = new int[nums.length];
        int ptr = 0;
        int temp;
        for(int i = 0; i <nums.length; i++){
            if(nums[i] != 0){
                nums[ptr++] = nums[i];
            }
        }
        for(int i = ptr; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}