package HolidayTask;

import java.util.Scanner;
public class gradingsyst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark=sc.nextInt();
        char g;
        if (mark >= 90) {
            g = 'A';
        } else if (mark >= 80) {
            g = 'B';
        } else if (mark >= 70) {
            g = 'C';
        } else if (mark >= 60) {
            g = 'D';
        } else if (mark >= 50) {
            g = 'E';
        } else {
            g = 'F';
        }
        System.out.println("GRADE : "+ g);
    }
}