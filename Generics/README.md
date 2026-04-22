# 📘 Generics in Java

## 📌 Introduction

Generics were introduced in Java 5 to provide **type safety** and improve **code reusability**. They allow classes, interfaces, and methods to operate on different data types while ensuring compile-time type checking.

Without generics, Java collections could store any type of object, which often led to runtime errors. Generics solve this problem by enforcing type constraints at compile time.

---

## 🎯 Key Benefits of Generics

* **Type Safety**: Prevents runtime errors like ClassCastException
* **Compile-Time Checking**: Errors are detected early
* **Code Reusability**: Same code works for multiple data types
* **No Explicit Casting**: Reduces unnecessary type conversions

---

## ⚠️ Without Generics (Problems)

* Allows storing mixed data types in collections
* Requires manual type casting
* Increases risk of runtime errors
* No compile-time error checking

---

## ✅ With Generics (Advantages)

* Ensures only one type of data is stored
* Eliminates need for casting
* Errors are caught at compile time
* Improves readability and maintainability

---

## 🧩 Generic Classes

A **generic class** allows defining a class with a type parameter.

### 🔹 Key Points:

* Works with any data type
* Promotes reusability
* Reduces duplicate code

---

## 🔧 Generic Methods

A **generic method** allows using type parameters within a method.

### 🔹 Key Points:

* Works with multiple data types
* Eliminates need for method overloading
* Can be used independently of class-level generics

---

## 🔒 Bounded Type Parameters

Bounded types restrict the type that can be used as a generic parameter.

### 🔹 Syntax Concept:

* A type can be restricted to a specific class or its subclasses

### 🔹 Key Points:

* Ensures type safety
* Allows use of methods specific to the bound type
* Prevents invalid data types

---

## ❓ Wildcard Types

Wildcards (`?`) are used when the exact type is unknown.

### 🔹 Types of Wildcards:

#### 1. Upper Bounded (`? extends T`)

* Accepts a type or its subclasses
* Allows reading data
* Restricts adding elements

#### 2. Lower Bounded (`? super T`)

* Accepts a type or its superclasses
* Allows adding elements
* Restricts reading specific types

---

## ⚠️ Raw Types

A **raw type** is a generic class used without specifying a type parameter.

### 🔹 Problems:

* No type safety
* Can mix different data types
* May cause runtime exceptions

### 🔹 Conclusion:

Raw types are not recommended in modern Java.

---

## 🔍 Type Erasure

Type Erasure is the process where generic type information is removed during compilation.

### 🔹 Key Points:

* Generics exist only at compile time
* JVM does not retain generic type information
* Generic types are replaced with `Object` or bounded types

---

## ⚙️ Impact of Type Erasure

* Cannot use `instanceof` with generic types
* Cannot create generic arrays
* Type information is not available at runtime

---

## 🌟 Advantages of Generics

* Improves type safety
* Enhances code reusability
* Reduces runtime errors
* Makes code cleaner and easier to maintain

---

## ❌ Disadvantages of Generics

* Adds complexity for beginners
* Type erasure limits some operations
* Cannot use primitives directly (must use wrapper classes)

---

## 📌 Conclusion

Generics are a powerful feature in Java that enhance type safety, reduce errors, and promote reusable code. By using generics effectively, developers can write cleaner, safer, and more flexible applications.
