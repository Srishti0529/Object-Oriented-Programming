package Access_Modifiers;
class Animal {
    protected String sound = "Animal sound";

    protected void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void display() {
        System.out.println(sound);   // Accessing protected variable
        makeSound();                 // Accessing protected method
    }
}

public class protected_am {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();
    }
}