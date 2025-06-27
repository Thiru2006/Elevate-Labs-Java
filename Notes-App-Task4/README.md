# 📝 Java File Handling System

This is a simple Java-based **file handling program** that demonstrates different file operations, including reading, writing, and appending to text files, with and without buffered streams. The program is completely menu-driven and runs in a command-line environment.

---

## 🚀 Features

The following file operations are supported:

1. **Write to a file** using `FileWriter`
2. **Read from a file** using `FileReader`
3. **Append data** to a file using `FileWriter` in append mode
4. **Read a file** using `BufferedReader`
5. **Write to a file** using `BufferedWriter`
6. **Append data** to a file using `BufferedWriter`

The user is prompted with a menu to choose these operations repeatedly until they decide to exit.

---

## 🏗️ How It Works

- The program uses:
  - `FileWriter` for writing/appending
  - `FileReader` for reading
  - `BufferedWriter` for buffered writing
  - `BufferedReader` for buffered reading

- Inside a **while loop**, the program repeatedly:
  - Prompts the user for a file operation
  - Executes the selected action
  - Asks if the user wants to continue

- Exception handling is provided to catch file or input errors gracefully.

---

## 💡 Usage

After running the program, you will see the following menu:

Operations Possible:

Write in file.

Read through a file.

Append data to a file.

Buffered Read.

Buffered Write.

Buffered Append


You can enter a choice from 1 to 6 and follow the prompts to:
- Provide the filename (with extension)
- Enter data to write or append, if needed

The program will then perform the required action and ask if you want to continue.

---

## 🛠️ Requirements

- Java 8 or higher
- Command-line interface or any IDE supporting Java

---


## 📂 Example
- Create a file:

Choose option 1

- Enter file name, e.g., test.txt

- Provide data to write

- Read the same file:

Choose option 2

- Enter test.txt to see the content printed to the console

- Append data:

Choose option 3

- Enter test.txt

- Provide more data to add at the end

--- 

## ⚙️ Notes
If you use a file that does not exist while reading, the program will throw an error message.

All data is handled in plain text format.

Buffered operations improve performance for larger files.

---

## 👨‍💻 Author
Developed by Thirugnanam V. S. as a demonstration of Java file I/O concepts.

---

## ✅ How to Compile and Run

```bash
javac Main.java
java Main

