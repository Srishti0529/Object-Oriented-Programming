# 📘 Polymorphism in Object-Oriented Programming

## 📌 Introduction

Polymorphism is a core concept of Object-Oriented Programming (OOP) that allows one object to take many forms.

* The word **Polymorphism** means *"many forms"*
* It enables a single method or object to behave differently in different situations

---

## 🎯 Purpose of Polymorphism

* Increases flexibility in code
* Enhances code reusability
* Supports method overloading and overriding
* Allows dynamic method behavior

---

## 🔄 Types of Polymorphism

### 1. Compile-Time Polymorphism (Method Overloading)

Occurs when multiple methods have the same name but different parameters.

```java id="q2k8lz"
class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
```

---

### 2. Runtime Polymorphism (Method Overriding)

Occurs when a child class provides a specific implementation of a method defined in the parent class.

```java id="7kd91x"
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal obj = new Dog();  // runtime polymorphism
        obj.sound();
    }
}
```

---

## ⚙️ Key Concepts

* **Method Overloading**: Same method name, different parameters
* **Method Overriding**: Same method name and parameters, different implementation
* **Dynamic Binding**: Method call is resolved at runtime

---

## ✅ Advantages

* Improves code flexibility
* Promotes reusability
* Simplifies code maintenance
* Supports dynamic behavior

---

## ❌ Disadvantages

* Can increase complexity
* Harder to debug
* Requires careful design

---

## 📌 Conclusion

Polymorphism allows objects to behave differently based on context, making programs more flexible, reusable, and easier to extend.
