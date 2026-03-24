package Day_3;

class Solution {
    public int arraySign(int[] nums) {
        int neg = 0;
        for(int i : nums) {
        if(i < 0){
            neg++;
        }
        else
        return 0;
        }
        if(neg % 2 == 0) return 1;
        else return -1;
    }
}