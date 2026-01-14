# Access Modifiers in Java 🚀

This folder contains my learning and practice of **Access Modifiers in Java**, which are an important part of **Object-Oriented Programming (OOPs)**.

Access modifiers define **the scope and visibility** of classes, variables, methods, and constructors.

---

## 📌 What are Access Modifiers?
Access modifiers control **who can access what** in a Java program.  
They help in achieving **encapsulation** and **data security**.

---

## 🔐 Types of Access Modifiers in Java

Java provides **four types** of access modifiers:

1. **Private**
2. **Default (Package-Private)**
3. **Protected**
4. **Public**

---

## 1️⃣ Private
- Accessible **only within the same class**
- Most restrictive access level
- Used to hide data from outside classes

📂 Folder:
Access_Modifiers/
└── PrivateDemo.java

---

## 2️⃣ Default (Package-Private)
- No keyword is used
- Accessible **within the same package**
- Not accessible outside the package

📂 Folder:
Access_Modifiers/
└── DefaultDemo.java

---

## 3️⃣ Protected
- Accessible within the **same package**
- Accessible in **subclasses** (even in different packages)
- Useful for inheritance

📂 Folder:
Access_Modifiers/
└── ProtectedDemo.java

---

## 4️⃣ Public
- Accessible **from anywhere**
- Least restrictive
- Used when data/methods should be globally available

📂 Folder:
Access_Modifiers/
└── PublicDemo.java

---

## 📊 Access Modifier Comparison Table

| Modifier    | Same Class | Same Package | Subclass | Other Packages |
|------------|-----------|--------------|----------|----------------|
| private    | ✅        | ❌           | ❌       | ❌             |
| default    | ✅        | ✅           | ❌       | ❌             |
| protected  | ✅        | ✅           | ✅       | ❌ (without inheritance) |
| public     | ✅        | ✅           | ✅       | ✅             |

---

## 🎯 Why Access Modifiers are Important?
- Improve **security**
- Support **encapsulation**
- Control **data exposure**
- Make code **clean and maintainable**

---

## 🧠 Learning Goal
- Understand all access modifiers clearly
- Know when and where to use each modifier
- Prepare for **interviews and exams**

---

## 📚 Concepts Covered
- Visibility control
- Encapsulation
- Inheritance behavior
- Package-level access

---

✨ This repository is part of my **OOPs learning journey in Java**.