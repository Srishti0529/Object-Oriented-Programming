# 📘 Cloning in Object-Oriented Programming (Java)

## 📌 Introduction

Cloning in Java is the process of creating an **exact copy of an object**.

* It is achieved using the `clone()` method
* The class must implement the **Cloneable interface**
* It avoids manual copying of object data

---

## 🎯 Purpose of Cloning

* Create duplicate objects efficiently
* Avoid writing repetitive copy code
* Improve performance when copying complex objects

---

## 🧱 Basic Syntax

```java id="cl1"
class Student implements Cloneable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(1, "John");
        Student s2 = (Student) s1.clone();

        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}
```

---

## 🔄 Types of Cloning

### 1. Shallow Copy

* Copies object but **references are shared**
* Changes in one object may affect the other

```java id="cl2"
class Address {
    String city;
}

class Student implements Cloneable {
    int id;
    Address addr;

    public Object clone() throws CloneNotSupportedException {
        return super.clone();  // shallow copy
    }
}
```

---

### 2. Deep Copy

* Copies object **along with referenced objects**
* Completely independent copy

```java id="cl3"
class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Student implements Cloneable {
    int id;
    Address addr;

    Student(int id, Address addr) {
        this.id = id;
        this.addr = addr;
    }

    public Object clone() throws CloneNotSupportedException {
        Address newAddr = new Address(addr.city);
        return new Student(id, newAddr);  // deep copy
    }
}
```

---

## ⚙️ Key Points

* Must implement **Cloneable interface**
* Override `clone()` method
* Use `super.clone()` for default cloning
* Handle `CloneNotSupportedException`

---

## ✅ Advantages

* Faster than creating a new object manually
* Useful for complex objects
* Reduces boilerplate code

---

## ❌ Disadvantages

* Shallow copy can cause issues
* Requires careful implementation for deep copy
* Not commonly recommended in modern Java (better alternatives exist like copy constructors)

---

## 📌 Conclusion

Cloning allows efficient duplication of objects, but it must be used carefully, especially when dealing with object references and deep copying.
