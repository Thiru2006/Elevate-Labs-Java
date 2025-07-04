import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    private String questionText;
    private String[] options;
    private int correctOption; 

    public Question(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }

    public void display() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    public boolean isCorrect(int userChoice) {
        return userChoice == correctOption;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
            "Which language runs in a web browser?",
            new String[]{"Java", "C", "Python", "JavaScript"},
            4
        ));
        questions.add(new Question(
            "What is the capital of France?",
            new String[]{"Berlin", "Paris", "London", "Madrid"},
            2
        ));
        questions.add(new Question(
            "Which planet is known as the Red Planet?",
            new String[]{"Earth", "Jupiter", "Mars", "Venus"},
            3
        ));
        questions.add(new Question(
            "Which data structure uses FIFO order?",
            new String[]{"Stack", "Queue", "Tree", "Graph"},
            2
        ));

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("===== Welcome to the Online Quiz App =====");

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQuestion " + (i + 1) + ":");
            q.display();

            System.out.print("Your answer (1-4): ");
            int userChoice = sc.nextInt();

            if (q.isCorrect(userChoice)) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Incorrect!");
            }
        }

        System.out.println("\n=====================================");
        System.out.println("Quiz finished! Your final score is: " + score + "/" + questions.size());
        System.out.println("=====================================");

        sc.close();
    }
}
