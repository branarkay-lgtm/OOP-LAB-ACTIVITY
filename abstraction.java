// Base class
class Animal {
    void speak() {
        System.out.println("Animal sound");
    }
}

// Subclass Dog that inherits from Animal
class Dog extends Animal {
    @Override
    void speak() {
        System.out.println("Bark");
    }
}

// Subclass Cat that inherits from Animal
class Cat extends Animal {
    @Override
    void speak() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of Dog and Cat
        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        // Call their speak() methods
        dog1.speak();
        cat1.speak();
    }
}
