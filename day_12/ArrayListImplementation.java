package day_12;

import java.util.*;
public class ArrayListImplementation {
    public static void main(String[] args) {
        ArrayList<Integer>  arrList = new ArrayList<>();
        //List<Integer> arrList = new LinkedList<>();
        // interface = class;

        //basic functions

        arrList.add(null);
        arrList.add(0, 10);
        arrList.add(0, 20);
        System.out.println(arrList);
        arrList.addFirst(5);
        arrList.set(3, 30);
        System.out.println(arrList);
        System.out.println(arrList.get(3));
        arrList.remove(2);

        System.out.println(arrList);

        System.out.println(arrList.contains(20));
        System.out.println(arrList.size());
        arrList.add(0);
        System.out.println(arrList.indexOf(0));
        System.out.println(arrList.lastIndexOf(0));
        // if both those values are the same then there are no duplicated in your list

        System.out.println(arrList.isEmpty());
        arrList.clear();
        System.out.println(arrList.isEmpty());
        System.out.println(arrList);
    }
}
