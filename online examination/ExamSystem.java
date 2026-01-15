import java.util.Scanner;

public class ExamSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        User user = new User();

        System.out.println("===== ONLINE EXAMINATION SYSTEM =====");

        System.out.print("Enter Username: ");
        String uname = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (!user.login(uname, pass)) {
            System.out.println("Invalid login credentials.");
            return;
        }

        System.out.println("Login successful!");

        System.out.print("Do you want to change password? (y/n): ");
        char ch = sc.next().charAt(0);
        sc.nextLine();

        if (ch == 'y' || ch == 'Y') {
            System.out.print("Enter new password: ");
            String newPass = sc.nextLine();
            user.updatePassword(newPass);
        }

        Question[] questions = {
            new Question(
                "Java is a ___?",
                new String[]{"OS", "Language", "Browser", "Device"},
                2
            ),
            new Question(
                "JVM stands for?",
                new String[]{"Java VM", "Java Virtual Machine", "Virtual Java", "None"},
                2
            ),
            new Question(
                "Which keyword is used to create object?",
                new String[]{"class", "this", "new", "object"},
                3
            )
        };

        Exam exam = new Exam();
        exam.startExam(questions);

        System.out.println("Logged out successfully.");
    }
}
