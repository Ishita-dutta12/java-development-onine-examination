import java.util.Scanner;

public class Exam {

    private int score = 0;

    public void startExam(Question[] questions) {
        Scanner sc = new Scanner(System.in);

        long startTime = System.currentTimeMillis();
        long timeLimit = 30000; // 30 seconds

        for (int i = 0; i < questions.length; i++) {

            if (System.currentTimeMillis() - startTime > timeLimit) {
                System.out.println("\nTime is up! Auto submitting exam...");
                break;
            }

            System.out.println("\nQ" + (i + 1) + ": " + questions[i].question);
            for (int j = 0; j < 4; j++) {
                System.out.println((j + 1) + ". " + questions[i].options[j]);
            }

            System.out.print("Your answer (1-4): ");
            int ans = sc.nextInt();

            if (ans == questions[i].correctOption) {
                score++;
            }
        }

        System.out.println("\nExam finished.");
        System.out.println("Your Score: " + score + "/" + questions.length);
    }
}
