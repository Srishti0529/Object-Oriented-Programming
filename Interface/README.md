# 📘 Interface in Object-Oriented Programming

## 📌 Introduction

An Interface in Object-Oriented Programming (OOP) is a blueprint of a class that contains abstract methods (methods without a body). It is used to achieve abstraction and multiple inheritance.

* An interface defines **what a class must do**, not **how it does it**
* A class implements an interface using the `implements` keyword

---

## 🎯 Purpose of Interface

* Achieve 100% abstraction
* Support multiple inheritance
* Define a contract for classes
* Improve flexibility and scalability

---

## 🧱 Syntax (Example in Java)

```java
interface Animal {
    void sound();   // abstract method
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.sound();
    }
}
```

---

## 🔄 Key Features

* Methods are **implicitly public and abstract**
* Variables are **public, static, and final**
* Cannot have constructors
* A class can implement multiple interfaces
* Supports abstraction and loose coupling

---

## ⚙️ Multiple Interface Example

```java
interface A {
    void show();
}

interface B {
    void display();
}

class Test implements A, B {
    public void show() {
        System.out.println("Interface A method");
    }

    public void display() {
        System.out.println("Interface B method");
    }
}
```

---

## ✅ Advantages

* Achieves full abstraction
* Supports multiple inheritance
* Promotes loose coupling
* Improves code flexibility

---

## ❌ Disadvantages

* Cannot provide method implementation (before Java 8)
* More complex than simple classes
* Requires additional coding effort

---

## 📌 Conclusion

Interfaces are used to define a contract that classes must follow. They help in designing flexible and scalable applications by separating implementation from definition.
