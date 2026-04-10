package day_15;

import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();
        Arrays.sort(T);
        Arrays.sort(S);
        s = new String(S);
        t = new String(T);
        return(s.equals(t));

    }
}