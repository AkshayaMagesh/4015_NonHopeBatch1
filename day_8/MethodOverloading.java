package day_8;

public class MethodOverloading {
    MethodOverloading(){
        System.out.println("no parameter");
    }
    MethodOverloading(int one) {
        System.out.println("one  parameter: "+one);
    }
    MethodOverloading(int one, int two) {
        System.out.println("Two parameters: "+one+" "+two);
    }
    public static void main(String[] args) {
        MethodOverloading eg;
        eg = new MethodOverloading();
        eg = new MethodOverloading(10);
        eg = new MethodOverloading(10, 20);
    }
}
