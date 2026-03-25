package day_4_task;

class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3) return false;
        for(int i = 1; i < arr.length - 1; i++) {
            if(inc(arr, i) && dec(arr, i))
            return true;
        }
        return false;
    }
    public static boolean inc(int[] arr, int index) {
        for(int i = 0; i < index; i++) {
            if(arr[i] >= arr[i+1])
            return false;
        }
        return true;
    }
    public static boolean dec(int[] arr, int index) {
        for(int i = index; i < arr.length - 1; i++) {
            if(arr[i] <= arr[i+1])
            return false;
        }
        return true;
    }
}