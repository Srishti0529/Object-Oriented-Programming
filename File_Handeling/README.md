# 📘 File Handling in Java

## 📌 Introduction

File handling in Java refers to the process of creating, reading, writing, and managing files stored on disk. It allows programs to store data permanently and retrieve it when needed.

This is essential for applications that need long-term data storage beyond program execution.

---

## 🎯 Key File Operations

Java supports several file operations:

* Creating a file
* Reading from a file
* Writing to a file
* Appending data to a file
* Deleting a file

---

## 📂 File Class

The `File` class (from `java.io` package) is used to create and manage files and directories.

### 🔹 Common Methods:

* `createNewFile()` → Creates a new file
* `exists()` → Checks if file exists
* `delete()` → Deletes a file
* `getAbsolutePath()` → Returns file path
* `length()` → Returns file size
* `canRead()` / `canWrite()` → Checks permissions

---

## ✍️ Writing to Files

### 🔹 FileWriter & BufferedWriter

* **FileWriter** writes character data
* **BufferedWriter** improves performance by buffering data

### 🔹 Key Points:

* Used for writing text into files
* BufferedWriter is more efficient
* Always close the file after writing

---

## 📖 Reading from Files

### 🔹 FileReader & BufferedReader

* **FileReader** reads character data
* **BufferedReader** reads data efficiently in chunks

### 🔹 Key Points:

* Reads file line by line
* Improves performance
* Must close the file after reading

---

## ♻️ Try-with-Resources

Try-with-resources automatically closes file resources after use.

### 🔹 Benefits:

* No need to manually close files
* Prevents resource leaks
* Cleaner and safer code

---

## 🧾 Logging with Files

File handling is often used for logging application data.

### 🔹 Uses:

* Debugging
* Tracking user activity
* Monitoring system behavior

Logs are typically written using buffered writers in append mode.

---

## 🌍 Importance in OOP

File handling is important in object-oriented programming for:

* **Data Storage** → Save user data and records
* **Logging** → Maintain logs for debugging
* **Configuration** → Store application settings

---

## ⚠️ Common Issues

### 🔹 FileNotFoundException

* Occurs when file does not exist
* Can be avoided by checking file existence

### 🔹 IOException

* Caused by permission issues, disk errors, etc.
* Must be handled using try-catch

### 🔹 Resource Leaks

* Happens when files are not closed properly
* Avoided using try-with-resources

---

## ✅ Advantages

* Enables persistent data storage
* Helps in real-world application development
* Supports efficient data handling
* Useful for logging and configuration

---

## ❌ Disadvantages

* Requires proper exception handling
* Risk of data loss if not handled correctly
* File operations can be slow for large data

---

## 📌 Conclusion

File handling in Java is a powerful feature that allows programs to interact with external files for storing and retrieving data. Proper use of file handling techniques ensures efficient, secure, and reliable applications.
