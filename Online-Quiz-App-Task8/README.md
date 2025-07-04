# Online Quiz App - Java Console Project

## Objective
This project is a simple **console-based quiz application** built in Java. It uses OOP principles to manage quiz questions, present options, accept user answers, and finally score the user.

---

## Features
✅ Console-based interface  
✅ Uses Java `List` to store multiple questions  
✅ Accepts user input for answering  
✅ Validates answers and displays score  

---

## Technologies Used
- Java
- Java Console (Scanner class)

---

## How the Code Works

### 1. Question.java
- Defines a `Question` class with:
  - `questionText` (the question itself)
  - `options` (array of possible answers)
  - `correctOption` (the index of the correct option, 1-based)
- Includes:
  - `display()` method to print the question and its options
  - `isCorrect(int userChoice)` method to check if the user’s answer matches the correct option

### 2. QuizApp.java
- Contains the `main` method
- Creates a `List` of `Question` objects with sample quiz questions
- Uses a `Scanner` to read the user’s input
- Iterates through each question, displaying it and reading the answer
- Tracks the total score by incrementing for correct answers
- Finally, prints the final score

---

## How to Run
1. Save the files:
   - `Question.java`
   - `QuizApp.java`

2. Open terminal in the folder containing these files and compile:
```bash
javac Question.java QuizApp.java
```

3. Run the program:
```bash
java QuizApp
```

---

## Example Questions Used
- Which language runs in a web browser? (correct: JavaScript)
- What is the capital of France? (correct: Paris)
- Which planet is known as the Red Planet? (correct: Mars)
- Which data structure uses FIFO order? (correct: Queue)

---

## Possible Extensions
- Add more questions from a file or database
- Add timer for each question
- Randomize questions
- Show correct answers at the end

Feel free to improve on this base code! 🚀

