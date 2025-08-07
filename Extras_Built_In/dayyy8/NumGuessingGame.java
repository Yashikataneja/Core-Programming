import java.util.Random;
import java.util.Scanner;

public class NumGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Think of a number between 1 and 100.");
        System.out.println("The computer will try to guess it!");
        System.out.println("After each guess, enter:");
        System.out.println("'low' if the guess is too low");
        System.out.println("'high' if the guess is too high");
        System.out.println("'correct' if the guess is correct");

        int low = 1;
        int high = 100;
        boolean found = false;

        while (!found && low <= high) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            String feedback = getUserFeedback(scanner);

            switch (feedback.toLowerCase()) {
                case "low":
                    low = guess + 1;
                    break;
                case "high":
                    high = guess - 1;
                    break;
                case "correct":
                    System.out.println("Hooray! The computer guessed it right: " + guess);
                    found = true;
                    break;
                default:
                    System.out.println("Invalid feedback. Please type 'low', 'high', or 'correct'.");
            }
        }

        if (!found) {
            System.out.println("Seems like something went wrong with the guesses.");
        }

        scanner.close();
    }

    // Function to generate a random guess between low and high (inclusive)
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }
    public static String getUserFeedback(Scanner scanner) {
        System.out.print("Enter feedback: ");
        return scanner.nextLine();
    }
}
