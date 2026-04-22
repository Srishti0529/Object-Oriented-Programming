package Abstraction;

// Abstract Class
abstract class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    // Abstract Method
    abstract void makeSound();
}

// Derived Class: Dog
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("The dog " + name + " says : Woof!");
    }
}

// Derived Class: Cat
class Cat extends Animal {
    Cat(String name) {
        super(name);
    }

    @Override
    void makeSound() {
        System.out.println("The cat " + name + " says : Meow!");
    }
}

// Main Class
public class code {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");

        dog.makeSound();
        cat.makeSound();
    }
}
