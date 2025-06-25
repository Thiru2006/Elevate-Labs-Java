# 📚 Student Record Management System (Java)

This is a simple **Student Record Management System** built using Java. The application allows users to:

- Add student details
- View all student records
- Update a student’s record by ID
- Delete a student’s record by ID

This project demonstrates the use of Java collections (`ArrayList`), object-oriented programming, and user input handling.

---

## 🛠️ Features

- ✅ Add new student records with ID, Name, and Marks  
- 📃 Display all existing records  
- 🔁 Update existing records using Student ID  
- ❌ Delete records using Student ID  
- 🎯 User-friendly CLI interface with input validation  

---

## 📁 Project Structure

Student-Record-Management-System/
│
├── Main.java # Entry point of the program
├── Student.java # Class handling all CRUD operations
└── README.md # Project description and usage


---

## 🔧 How to Run

1. Make sure you have Java installed (`JDK 8` or higher).
2. Clone or download this repository:
   ```bash
   git clone https://github.com/your-username/Student-Record-Management-System.git
3. Navigate to the project directory:
cd Student-Record-Management-System
4. Compile the Java files:
javac Main.java Student.java
5. Run the program:
java Main

🖥️ Sample Output
Choose an Option to Perform:
1. Add Details
2. View Records
3. Update Records
4. Delete Records
Enter your choice: 1
Enter student ID: 101
Enter student Name: Thiru
Enter student Marks: 97.5
Details added Successfully!
Do you want to continue (y/n)?: y

📌 Notes
Records are stored in memory using ArrayLists. Data will be lost once the program is closed.

Each operation is executed based on user input through the terminal.

🧑‍💻 Author
Thirugnanam.V.S

📜 License
This project is open-source and available under the MIT License.