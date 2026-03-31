package day_8;

class Animal {
    void sound() {
        System.out.println("All animals have different sound");
    }
}

class Dog extends Animal{
    void sound() {
        System.out.println("Dog will bark");
    }
}

class Cat extends Animal {
    Cat() {
        super();
    }
    void sound() {
        System.out.println("Cats will meow");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        Animal animal;
        animal = new Cat();
        animal.sound();
    }
}