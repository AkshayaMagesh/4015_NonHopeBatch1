package day_4;
class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder test = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                test.append(Character.toLowerCase(c));
            }
        }
        
        int left = 0;
        int right = test.length() - 1;
        
        while (left < right) {
            if (test.charAt(left) != test.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}