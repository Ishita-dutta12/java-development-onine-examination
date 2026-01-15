public class Question {

    String question;
    String[] options;
    int correctOption; // 1-based index

    public Question(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }
}
