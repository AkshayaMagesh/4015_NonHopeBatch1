package day_8;

public class MethodOverriding {
    public static void main(String[] args) {
        Dog snowy = new Dog();
        snowy.sound();
    }
}

class Animal {
    void sound(){
        System.out.println("Makes cute noises");
    }
}

class Dog extends Animal{
    @Override
    void sound() {
        System.out.println("Makes cute dog noises");
    }
}
