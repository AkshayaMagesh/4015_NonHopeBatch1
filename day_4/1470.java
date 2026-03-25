package day_4;

class Solution {
    public int[] shuffle(int[] nums, int n) {
        int sub1[] = new int[n];
        int sub2[] = new int[n];

        for(int i = 0; i < n; i++){
            sub1[i] = nums[i];
            sub2[i] = nums[i + n];
        }

        int result[] = new int[2*n];
        int index = 0;
        for(int i = 0; i < n; i++){
            result[index++] = sub1[i];
            result[index++] = sub2[i];
        }

        return result;
    }
}