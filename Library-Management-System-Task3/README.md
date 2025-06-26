# 📚 Java Library Management System

A simple command-line based **Library Management System** written in Java. This program allows users to:

- View all available books
- Issue a book
- Return a book

---

## 🏗️ Project Structure

The system is designed using **Object-Oriented Programming (OOP)** concepts with the following classes:

### 1. `Book`
Handles book-related data and operations.

- **Attributes**:
  - `Books`: List of book titles.
  - `Author`: Corresponding authors for each book.
  - `Quantity`: Available quantity for each book.
  
- **Methods**:
  - `AllBooks()`: Displays all books with authors and available quantities.
  - `IssueBook(Scanner ss)`: Allows user to issue a book if available.
  - `ReturnBook(Scanner ss)`: Allows user to return a previously issued book.

---

### 2. `User`
Manages user interaction with the system.

- **Constructor**:
  - Takes user input for name.
  - Displays menu for actions: view books, issue book, return book.
  - Handles repeated operations in a loop based on user confirmation.

---

### 3. `Library`
Acts as a controller class.

- **Constructor**:
  - Creates a `Book` object.
  - Passes it to the `User` class to initiate interaction.

---

### 4. `Main`
The main entry point of the program.

- Instantiates the `Library` object using a `Scanner`.

---

## 🚀 How It Works

1. Run the program.
2. Enter your username.
3. Choose from the following options:
   - **1**: View all available books.
   - **2**: Issue a book (if available).
   - **3**: Return a book.
4. After each operation, you're asked if you want to continue.
5. Loop exits when the user chooses not to continue.

---

## 🧪 Sample Books Included

| Book Title                 | Author                          | Initial Quantity |
|---------------------------|----------------------------------|------------------|
| Clean Code                | Robert C. Martin                | 10               |
| Think Like a Programmer   | V. Anton Spraul                 | 2                |
| The Clean Coder           | Robert C. Martin                | 51               |
| The Pragmatic Programmer  | Andrew Hunt and David Thomas    | 12               |
| Code Complete             | Steve McConnell                 | 1                |

---

## ✅ Features

- Interactive command-line menu
- Real-time update of book quantities
- Simple and clean OOP design
- Input validation for book availability

---

## 📝 Notes

- Each issued or returned book updates the quantity **persistently** during the session.
- Program uses a **single `Book` object** shared between classes to retain state.
- No external file/database is used — all data is in-memory.

---

## 🛠️ Requirements

- Java 8 or above
- Any IDE or command-line interface to compile and run the program

---

## 🔄 To Compile and Run

```bash
javac Main.java
java Main

👨‍💻 Author

Developed by Thirugnanam V. S. as part of Java learning and OOP practice.