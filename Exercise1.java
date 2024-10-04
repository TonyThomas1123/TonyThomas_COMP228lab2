

import javax.swing.JOptionPane;
import java.util.Random;

public class Exercise1 {
    private String[] questions = {
            "Question 1: Who developed Java?",
            "Question 2: What is the Java Class Library?",
            "Question 3: Which is the correct order of the typical Java environment?",
            "Question 4: How many phases are there in a Java program life cycle?",
            "Question 5: In which phase of Java is the source code translated to bytecode?"
    };

    private String[][] options = {
            {"1) Microsoft", "2) Sun Microsystems", "3) Apple", "4) Google"},
            {"1) A collection of classes", "2) A database", "3) An IDE", "4) A framework"},
            {"1) Write -> Compile -> Execute", "2) Edit -> Compile -> Load -> Verify -> Execute",
                    "3) Edit -> Load -> Execute -> Compile", "4) Write -> Debug -> Run -> Execute"},
            {"1) 3", "2) 4", "3) 5", "4) 6"},
            {"1) Execution", "2) Compilation", "3) Loading", "4) Linking"}
    };

    private int[] correctAnswers = {2, 1, 2, 3, 2};  // Correct answer indices for the questions
    private int correctCount = 0;
    private int incorrectCount = 0;

    public void inputAnswer() {
        for (int i = 0; i < questions.length; i++) {
            simulateQuestion(i);
        }
        displayResults();
    }

    public void simulateQuestion(int index) {
        String question = questions[index] + "\n" + String.join("\n", options[index]);
        String answer = JOptionPane.showInputDialog(null, question);
        int answerInt = Integer.parseInt(answer);
        checkAnswer(answerInt, index);
    }

    public void checkAnswer(int answer, int questionIndex) {
        if (answer == correctAnswers[questionIndex]) {
            correctCount++;
            JOptionPane.showMessageDialog(null, generateMessage(true));
        } else {
            incorrectCount++;
            JOptionPane.showMessageDialog(null, generateMessage(false) +
                    "\nCorrect Answer: " + correctAnswers[questionIndex]);
        }
    }

    public String generateMessage(boolean isCorrect) {
        Random random = new Random();
        String[] correctMessages = {"Excellent!", "Good!", "Keep up the good work!", "Nice work!"};
        String[] incorrectMessages = {"No. Please try again", "Wrong. Try once more", "Don't give up!", "No. Keep trying."};
        if (isCorrect) {
            return correctMessages[random.nextInt(4)];
        } else {
            return incorrectMessages[random.nextInt(4)];
        }
    }

    public void displayResults() {
        int total = correctCount + incorrectCount;
        double percentage = ((double) correctCount / total) * 100;
        JOptionPane.showMessageDialog(null, "Correct: " + correctCount + "\nIncorrect: " + incorrectCount +
                "\nPercentage: " + percentage + "%");
    }

    public static void main(String[] args) {
        Exercise1 test = new Exercise1();
        test.inputAnswer();
    }
}
