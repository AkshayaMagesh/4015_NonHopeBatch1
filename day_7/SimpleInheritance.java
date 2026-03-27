package day_7;
public class SimpleInheritance {
    public static void main(String[] args) {
        System.out.println("Inside main function");
        //Child c = new Child();
        //c.display1();
        Parent p = new Parent();
        Parent p1 = new Child();
        p.display();
        p1.display();
    }
}

class Parent {
    int x = 10;
    void display() {
        System.out.println("I am inside parent class");
    }
}

class Child extends Parent {
    void display1() {
        System.out.println("I am inside child class. Value from parent class is: " + x);
    }
}