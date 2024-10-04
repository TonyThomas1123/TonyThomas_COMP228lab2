import javax.swing.*;
import java.util.Random;

public class Exercise2 {
    private int[] numbers = new int[3]; // Array to hold three random numbers

    // Constructor to randomly populate the array
    public Exercise2() {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(9) + 1; // Random numbers between 1 and 9
        }
    }

    // Method to return the array
    public int[] getNumbers() {
        return numbers;
    }

    // Method to calculate the sum of the lotto numbers
    public int getSum() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Input: User chooses a number between 3 and 27
        int userNumber = Integer.parseInt(JOptionPane.showInputDialog("Choose a number between 3 and 27:"));
        boolean userWon = false;

        // The user has up to 5 attempts to match the sum
        for (int i = 0; i < 5; i++) {
            Exercise2 lotto = new Exercise2();
            int sum = lotto.getSum(); // Calculate the sum of the lotto numbers

            // Show the generated lotto numbers and their sum
            JOptionPane.showMessageDialog(null, "Lotto Numbers: "
                    + lotto.getNumbers()[0] + ", " + lotto.getNumbers()[1] + ", " + lotto.getNumbers()[2]
                    + "\nSum: " + sum);

            // Check if the user's number matches the sum
            if (userNumber == sum) {
                JOptionPane.showMessageDialog(null, "You won! The sum matched your number!");
                userWon = true;
                break; // End the game if the user wins
            } else {
                JOptionPane.showMessageDialog(null, "Try again! The sum did not match your number.");
            }
        }

        // If the user hasn't won in 5 attempts, the computer wins
        if (!userWon) {
            JOptionPane.showMessageDialog(null, "Computer wins! You did not match the sum in 5 tries.");
        }
    }
}
