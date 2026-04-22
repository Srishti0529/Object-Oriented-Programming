# 📘 Association, Aggregation, and Composition in OOP

## 📌 Introduction

Association, Aggregation, and Composition define relationships between classes in Object-Oriented Programming (OOP). They describe how objects are connected and interact with each other.

---

## 🔗 1. Association

### 📖 Definition

Association is a **relationship between two classes** where objects of one class are connected to objects of another class.

* It represents a **"uses-a"** relationship
* Can be one-to-one, one-to-many, or many-to-many

### 🧱 Example

```java id="as1"
class Teacher {
    String name;
}

class Student {
    String name;
}

class Main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        Student s = new Student();
        // Association: Teacher and Student are related
    }
}
```

---

## 🧩 2. Aggregation

### 📖 Definition

Aggregation is a **special type of association** where one class contains a reference to another class, but both can exist independently.

* Represents a **"has-a"** relationship
* Weak relationship
* Objects can exist without each other

### 🧱 Example

```java id="ag1"
class Address {
    String city;
}

class Employee {
    Address address;  // Aggregation

    Employee(Address address) {
        this.address = address;
    }
}
```

---

## 🔒 3. Composition

### 📖 Definition

Composition is a **strong form of aggregation** where one class completely owns another class.

* Represents a strong **"part-of"** relationship
* If the parent object is destroyed, the child object is also destroyed

### 🧱 Example

```java id="co1"
class Engine {
    void start() {
        System.out.println("Engine starts");
    }
}

class Car {
    private Engine engine;

    Car() {
        engine = new Engine();  // Composition
    }

    void startCar() {
        engine.start();
    }
}
```

---

## ⚖️ Key Differences

| Feature      | Association | Aggregation | Composition    |
| ------------ | ----------- | ----------- | -------------- |
| Relationship | Uses-a      | Has-a       | Part-of        |
| Strength     | Weak        | Medium      | Strong         |
| Dependency   | Independent | Independent | Dependent      |
| Lifecycle    | Separate    | Separate    | Same lifecycle |

---

## ✅ Advantages

* Improves code reusability
* Helps in better system design
* Clearly defines relationships between objects

---

## ❌ Disadvantages

* Can increase design complexity
* Requires proper understanding of relationships

---

## 📌 Conclusion

Association, Aggregation, and Composition are essential for designing relationships in OOP. Choosing the correct relationship helps in building efficient, maintainable, and scalable applications.
