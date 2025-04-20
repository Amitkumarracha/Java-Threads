Sure! Here’s the full `README.md` file in one go — you can directly copy and paste this into your repository:

---

```markdown
# Java Threads Demonstration Project

### 📌 Author Details
- **Name:** Amitkumar Racha  
- **PRN:** 24070126501  
- **Batch:** A1 (2023–27)  

---

## 🚀 Project Overview

This project demonstrates the working of **multithreading in Java** using both the `Thread` class and the `Runnable` interface. The program is organized into multiple files and follows Java coding standards and documentation guidelines. Each operation is modular and implemented as a separate function, making the code maintainable and easy to understand.

---

## 📁 Project Structure

```plaintext
JavaThreadsDemo/
│
├── Main.java             → Entry point of the program
├── CounterThread.java    → Counts numbers in a thread (extends Thread)
├── MessageThread.java    → Displays messages at intervals (extends Thread)
├── ResourceTask.java     → Implements a task accessing a shared resource (implements Runnable)
├── SharedResource.java   → Simulates synchronized access to a common resource
└── README.md             → Project documentation
```

---

## 🧠 Thread Components and Functionality

### ✅ `Main.java`
- **Purpose:** Entry point for the program.
- **Functionality:**
  - Creates and starts multiple threads: `CounterThread`, `MessageThread`, and a `Thread` using `Runnable` (`ResourceTask`).
  - Uses `join()` to wait for threads to finish execution.
- **Highlights:** Demonstrates how to start and synchronize multiple threads.

### ✅ `CounterThread.java`
- **Class:** `CounterThread` extends `Thread`
- **Method:** `run()`
- **Functionality:**
  - Counts from 1 to a given limit.
  - Uses `Thread.sleep()` for 1-second intervals between counts.

### ✅ `MessageThread.java`
- **Class:** `MessageThread` extends `Thread`
- **Method:** `run()`
- **Functionality:**
  - Displays predefined messages in a loop.
  - Demonstrates timed delays (2 seconds) in threaded output.

### ✅ `ResourceTask.java`
- **Class:** `ResourceTask` implements `Runnable`
- **Method:** `run()`
- **Functionality:**
  - Calls a shared synchronized method in `SharedResource`.
  - Simulates accessing the resource multiple times with a delay.
  - Demonstrates proper usage of `wait()` and `notify()`.

### ✅ `SharedResource.java`
- **Class:** `SharedResource`
- **Method:** `accessResource(String threadName)`
- **Functionality:**
  - A synchronized method to simulate exclusive resource usage.
  - Handles access control via `inUse` flag and `wait()`/`notify()` mechanism.

---

## ⚙️ Features Demonstrated

- ✅ Thread creation using both `Thread` and `Runnable`
- ✅ Thread execution and coordination
- ✅ Synchronization using `synchronized` keyword
- ✅ Inter-thread communication with `wait()` and `notify()`
- ✅ Delay using `Thread.sleep()`
- ✅ Proper use of JavaDoc and inline comments
- ✅ Modular structure with separate files and functions

---

## 🔀 Git Commit Guidelines

Each file and method has its **own commit**, as per the assignment requirements.  
Use descriptive commit messages like:
- `Add CounterThread class with counting logic`
- `Implement synchronized SharedResource access method`
- `Create main thread runner with join and start logic`

---

## 📝 How to Run

1. **Compile All Files:**
   ```bash
   javac *.java
   ```

2. **Run the Main Program:**
   ```bash
   java Main
   ```


## **Installation & Setup**

### **1. Clone the Repository**
```sh
git clone https://github.com/your-username/JavaThreadsDemo.git
cd JavaThreadsDemo




## **Output**

[CounterThread] Count: 1
[MessageThread] Hello from MessageThread!
[CounterThread] Count: 2
[ResourceTask] Thread-1 is accessing shared resource...
[CounterThread] Count: 3
[MessageThread] Hello from MessageThread!
[CounterThread] Count: 4
[ResourceTask] Thread-1 is done using shared resource.
[CounterThread] Count: 5
[Main] All threads have finished.




Contributing
🔹 Fork the repository
🔹 Create a new branch: git checkout -b feature/thread-optimization
🔹 Commit your changes: git commit -m "Optimized thread resource sharing"
🔹 Push to your branch: git push origin feature/thread-optimization
🔹 Open a Pull Request


---


