package day_5;

class Solution {
    public String reverseWords(String s) {
        int left;
        int right;
        String[] word = s.split(" ");
        left = 0;
        right = word.length - 1;
        while(left < right){
            String temps = word[left];
            word[left] = word[right];
            word[right] = temps;
            left++;
            right--;
        }
        String str = "";
        for(int i = 0; i < word.length; i++){
            str += word[i];
            if (i < word.length - 1) {
            str += " ";
    }
        }
        char[] swap = str.toCharArray();
        left = 0;
        right = str.length() - 1;
        while(left < right){
            char temp = swap[left];
            swap[left] = swap[right];
            swap[right] = temp;
            left++;
            right--;
        }

        String result = new String(swap);
        return result;
    }
}