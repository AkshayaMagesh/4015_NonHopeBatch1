package day_5_task;

import java.util.*;
public class contains_all {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = in.next();
        int flag = 0;
        for(char ch : input.toCharArray()) {
            flag ^= (1<<(ch - 'a'));
        }
        if(flag == 0 || (flag&flag-1) == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        in.close();
    }
}
