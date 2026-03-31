package day_9;


abstract class Animal {
    abstract void sound();
    void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Barks...");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Meows...");
    }
}
public class AbstractEg {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        a.sound();
    }
}

