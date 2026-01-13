# Encapsulation in Object-Oriented Programming (OOPS)

Encapsulation is one of the four fundamental pillars of Object-Oriented Programming (OOPS).  
It focuses on **binding data (variables) and methods (functions) together** and **restricting direct access** to an object’s internal state.

---

## 📌 What is Encapsulation?
Encapsulation is the process of **wrapping data and the methods that operate on that data into a single unit (class)** and controlling access using **access modifiers**.

In simple words:
> **Encapsulation = Data Hiding + Controlled Access**

---

## ❓ Why is Encapsulation Used?

Encapsulation is used to:
- Protect data from unauthorized access
- Prevent accidental modification of data
- Improve code security and reliability
- Make code easier to maintain and debug
- Control how data is accessed or modified

---

## 🧠 How Encapsulation is Achieved in Java
Encapsulation in Java is achieved by:
1. Declaring class variables as **private**
2. Providing **public getter and setter methods**
3. Accessing data only through these methods

---

## 🔑 Key Concepts of Encapsulation

### 1️⃣ Data Hiding
- Internal variables are hidden using the `private` keyword
- Data cannot be accessed directly from outside the class

### 2️⃣ Controlled Access
- Access to data is provided through public methods
- Validation logic can be added inside methods

### 3️⃣ Access Modifiers
| Modifier | Access Level |
|-------|--------------|
| private | Within the same class |
| default | Same package |
| protected | Same package + subclass |
| public | Everywhere |

---

## 📂 Files in this Folder
- `Encapsulation.java` → Java program demonstrating encapsulation using a `BankAccount` example

---

## 🏦 Real-World Example
A **Bank Account** is a real-world example of encapsulation:
- Balance should not be directly modified
- Deposit and withdrawal must follow rules
- Only valid operations are allowed

This ensures **security and data integrity**.

---

## 🧪 How This Code Demonstrates Encapsulation
- `balance` and `accountHolderName` are declared **private**
- Access is provided using:
  - `getBalance()`
  - `deposit()`
  - `withdraw()`
- Direct modification of balance is not allowed

---

## ✅ Advantages of Encapsulation
- Improves code security
- Enhances maintainability
- Allows validation before modifying data
- Supports modular programming
- Makes code easier to test and debug

---

## ⚠️ Important Interview Points
- Encapsulation is about **data protection**, not abstraction
- Getters and setters are not mandatory but commonly used
- Encapsulation reduces dependency between classes

---

## 🚀 Language Used
- **Java**

---

## 📝 Summary
Encapsulation helps in building **secure, maintainable, and well-structured applications** by restricting direct access to data and allowing controlled interaction through methods.

> Encapsulation is a foundational concept for writing clean and professional Java code.