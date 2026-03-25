package day_5;

class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int result = 0;
        for(char ch : s.toCharArray()) {
            if(ch == 'L'){
                count++;
            }
            else {
                count--;
            }
            if(count == 0){
                result++;
            }
        }
        return result;
    }
}