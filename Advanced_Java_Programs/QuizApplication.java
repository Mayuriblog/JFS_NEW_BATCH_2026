import java.util.*;

class Question {
    String question;
    String[] options;
    char correctAnswer;

    Question(String question, String[] options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class QuizApplication {

    static Scanner sc = new Scanner(System.in);

    static List<Question> questions = new ArrayList<>();

    // -------- LOAD QUESTIONS --------
    static void loadQuestions() {
        questions.add(new Question(
                "What is the size of int in Java?",
                new String[]{"A. 2 bytes", "B. 4 bytes", "C. 8 bytes", "D. Depends on system"},
                'B'));

        questions.add(new Question(
                "Which keyword is used to inherit a class?",
                new String[]{"A. implements", "B. extends", "C. inherits", "D. super"},
                'B'));

        questions.add(new Question(
                "Which collection does not allow duplicates?",
                new String[]{"A. List", "B. Set", "C. Map", "D. Queue"},
                'B'));

        questions.add(new Question(
                "Which method is entry point in Java?",
                new String[]{"A. start()", "B. run()", "C. main()", "D. init()"},
                'C'));
    }

    // -------- START QUIZ --------
    static void startQuiz() {
        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);

            System.out.println("\nQ" + (i + 1) + ": " + q.question);

            for (String opt : q.options) {
                System.out.println(opt);
            }

            System.out.print("Your answer (A/B/C/D): ");
            char answer = sc.next().toUpperCase().charAt(0);

            if (answer == q.correctAnswer) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.correctAnswer);
            }
        }

        System.out.println("\n--- Result ---");
        System.out.println("Score: " + score + "/" + questions.size());

        double percentage = (score * 100.0) / questions.size();
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 75)
            System.out.println("Grade: PASS");
        else
            System.out.println("Grade: FAIL");
    }

    // -------- MAIN --------
    public static void main(String[] args) {

        loadQuestions();

        while (true) {
            System.out.println("\n=== Quiz Application ===");
            System.out.println("1. Start Quiz");
            System.out.println("2. Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> startQuiz();
                case 2 -> {
                    System.out.println("Thank you!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}