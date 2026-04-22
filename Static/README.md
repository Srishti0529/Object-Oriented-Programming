# 📘 Static Keyword in Object-Oriented Programming (Java)

## 📌 Introduction

The **static keyword** in Java is used to define members (variables, methods, blocks, nested classes) that belong to the class rather than to any specific object.

* Static members are **shared among all instances**
* They can be accessed **without creating an object**

---

## 🎯 Purpose of Static Keyword

* Save memory by sharing data among objects
* Provide global access to variables and methods
* Useful for utility or helper functions
* Maintain common data for all objects

---

## 🧱 Static Variable Example

```java id="sv1"
class Student {
    int rollNo;
    String name;
    static String college = "ABC College";  // static variable

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }
}
```

---

## ⚙️ Static Method Example

```java id="sm1"
class MathUtils {
    static int square(int x) {
        return x * x;
    }
}

public class Main {
    public static void main(String[] args) {
        int result = MathUtils.square(5);  // no object needed
        System.out.println(result);
    }
}
```

---

## 🔄 Static Block Example

```java id="sb1"
class Demo {
    static {
        System.out.println("Static block executed");
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
    }
}
```

---

## 🧩 Key Points

* Static members belong to the **class, not objects**
* Accessed using **ClassName.member**
* Static methods can only directly access static data
* Static blocks execute **once when class is loaded**

---

## ✅ Advantages

* Memory efficient (shared data)
* Easy access without object creation
* Useful for constants and utility methods

---

## ❌ Disadvantages

* Cannot access non-static members directly
* Reduces flexibility (less object-oriented)
* Overuse can make code harder to manage

---

## 📌 Conclusion

The static keyword is useful for defining class-level data and behavior that is common to all objects, improving efficiency and simplifying access.
