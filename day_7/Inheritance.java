package day_7;

public class Inheritance {
    public static void main(String[] args) {
        // Dog dog = new Dog();
        // dog.display();
        // dog.bark();
        // System.out.println(dog.hashCode());
        Toyota tcar = new Toyota();
        tcar.display();
        tcar.land();
        tcar.affordable();
    }
}

class Vehicle {
    void display() {
        System.out.println("this is a vehicle");
    }
}

class Car extends Vehicle {
    void land() {
        System.out.println("I can be driven on land");
    }
}

class Toyota extends Car {
    void affordable() {
        System.out.println("I am an affordable car");
    }
}
