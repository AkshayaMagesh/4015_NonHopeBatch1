package day_13;

import java.util.*;
public class SetImplementation {
    public static void main(String[] args) {

        Set<Integer> setInteger = new HashSet<>();
        setInteger.add(1);
        System.out.println(setInteger);
        setInteger.add(2);
        System.out.println(setInteger);
        System.out.println(setInteger.contains(1));


        //Un ordered hash set cuz it follows hashcode based order.
        Set<String> setString = new LinkedHashSet<>();
        setString.add("Rampex");
        setString.add("Akshaya");
        System.out.println(setString);
        setString.add("noisy");
        setString.add("noice");
        setString.add("noisy");
        System.out.println(setString);
        //System.out.println(setString.get(0)); error cuz we can't access sets like that.

        for(String str: setString) {
            System.out.println(str);
        }
    }
}

// 217

// Set<Integer> set = new HashSet<>();
// for(Integer num : nums) {
//     if(set.contains(num)) {
//         return true;
//     }
//     set.add(num);
// }
// return false;


//219 contains duplicate II

