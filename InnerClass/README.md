# 📘 Inner Class in Object-Oriented Programming (Java)

## 📌 Introduction

An **Inner Class** is a class defined inside another class. It is used to logically group classes and increase encapsulation.

* The outer class is called **Outer Class**
* The class inside it is called **Inner Class**

---

## 🎯 Purpose of Inner Class

* Improves code organization
* Enhances encapsulation
* Makes code more readable and maintainable
* Allows access to private members of the outer class

---

## 🧱 Basic Syntax

```java id="ic1"
class Outer {
    int x = 10;

    class Inner {
        void display() {
            System.out.println("Value of x: " + x);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Outer obj = new Outer();
        Outer.Inner innerObj = obj.new Inner();
        innerObj.display();
    }
}
```

---

## 🔄 Types of Inner Classes

### 1. Member Inner Class

* Defined inside a class (not static)
* Can access all members of outer class

### 2. Static Nested Class

* Declared with `static` keyword
* Cannot access non-static members directly

```java id="ic2"
class Outer {
    static class Nested {
        void show() {
            System.out.println("Static nested class");
        }
    }
}
```

---

### 3. Local Inner Class

* Defined inside a method

```java id="ic3"
class Outer {
    void display() {
        class Local {
            void message() {
                System.out.println("Local inner class");
            }
        }
        Local obj = new Local();
        obj.message();
    }
}
```

---

### 4. Anonymous Inner Class

* Class without a name
* Used for one-time use

```java id="ic4"
abstract class Animal {
    abstract void sound();
}

class Test {
    public static void main(String[] args) {
        Animal obj = new Animal() {
            void sound() {
                System.out.println("Anonymous class sound");
            }
        };
        obj.sound();
    }
}
```

---

## ⚙️ Key Points

* Inner classes can access private members of outer class
* Helps in better grouping of related classes
* Reduces namespace clutter
* Useful in event handling and callbacks

---

## ✅ Advantages

* Better encapsulation
* More readable and organized code
* Easier maintenance
* Logical grouping of classes

---

## ❌ Disadvantages

* Increases complexity
* Harder to understand for beginners
* Can make code bulky if overused

---

## 📌 Conclusion

Inner classes help in organizing code logically and improving encapsulation by keeping related classes together within a single outer class.
