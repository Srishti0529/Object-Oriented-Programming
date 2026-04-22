# 📘 Inheritance in Object-Oriented Programming

## 📌 Introduction

Inheritance is a fundamental concept of Object-Oriented Programming (OOP) that allows one class to acquire the properties and behaviors (methods) of another class.

* The class that is inherited from is called the **Parent Class / Superclass**
* The class that inherits is called the **Child Class / Subclass**

---

## 🎯 Purpose of Inheritance

* Code reusability
* Reduces redundancy
* Improves maintainability
* Enables method overriding (runtime polymorphism)

---

## 🧱 Syntax (Example in Java)

```java
class Parent {
    void show() {
        System.out.println("This is parent class");
    }
}

class Child extends Parent {
    void display() {
        System.out.println("This is child class");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();     // inherited method
        obj.display();  // child method
    }
}
```

---

## 🔄 Types of Inheritance

1. **Single Inheritance** – One child inherits from one parent
2. **Multilevel Inheritance** – Chain of inheritance (A → B → C)
3. **Hierarchical Inheritance** – Multiple children inherit from one parent
4. **Multiple Inheritance** – One child inherits from multiple parents (not supported in Java using classes, but possible using interfaces)

---

## ⚙️ Key Concepts

* **super keyword**: Used to access parent class methods and constructors
* **Method Overriding**: Child class provides its own implementation of a method
* **Constructor Inheritance**: Constructors are not inherited but can be called using `super()`

---

## ✅ Advantages

* Promotes code reuse
* Makes code more organized
* Easier to extend functionality

---

## ❌ Disadvantages

* Tight coupling between classes
* Can increase complexity if overused
* Changes in parent class can affect child classes

---

## 📌 Conclusion

Inheritance helps in building a hierarchical relationship between classes and promotes reuse of existing code, making programs more efficient and easier to manage.
