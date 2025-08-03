import java.util.Scanner;

public class RockPaperScissors {

    public static String getComputerChoice() {
        double random = Math.random();
        if (random < 1.0 / 3) {
            return "rock";
        } else if (random < 2.0 / 3) {
            return "paper";
        } else {
            return "scissors";
        }
    }
    public static String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "tie";
        }
        switch (playerChoice) {
            case "rock":
                return (computerChoice.equals("scissors")) ? "player" : "computer";
            case "paper":
                return (computerChoice.equals("rock")) ? "player" : "computer";
            case "scissors":
                return (computerChoice.equals("paper")) ? "player" : "computer";
            default:
                return "invalid";
        }
    }
    public static String[][] calculateStats(int playerWins, int computerWins, int ties, int totalGames) {
        String[][] stats = new String[4][3];
        stats[0][0] = "Result";
        stats[0][1] = "Count";
        stats[0][2] = "Winning Percentage";

        stats[1][0] = "Player Wins";
        stats[1][1] = String.valueOf(playerWins);
        stats[1][2] = String.format("%.2f%%", playerWins * 100.0 / totalGames);

        stats[2][0] = "Computer Wins";
        stats[2][1] = String.valueOf(computerWins);
        stats[2][2] = String.format("%.2f%%", computerWins * 100.0 / totalGames);

        stats[3][0] = "Ties";
        stats[3][1] = String.valueOf(ties);
        stats[3][2] = String.format("%.2f%%", ties * 100.0 / totalGames);

        return stats;
    }


    public static void displayResults(String[] userChoices, String[] computerChoices, String[] winners, String[][] stats) {
        System.out.println("Game\tPlayer\tComputer\tWinner");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < userChoices.length; i++) {
            System.out.printf("%d\t%s\t%s\t\t%s\n", i + 1, userChoices[i], computerChoices[i], winners[i]);
        }

        System.out.println("\nOverall Statistics:");
        System.out.println("-------------------");
        System.out.printf("%-15s %-10s %-20s\n", stats[0][0], stats[0][1], stats[0][2]);
        for (int i = 1; i < stats.length; i++) {
            System.out.printf("%-15s %-10s %-20s\n", stats[i][0], stats[i][1], stats[i][2]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of games to play: ");
        int numGames = scanner.nextInt();
        scanner.nextLine();

        String[] userChoices = new String[numGames];
        String[] computerChoices = new String[numGames];
        String[] winners = new String[numGames];

        int playerWins = 0;
        int computerWins = 0;
        int ties = 0;

        for (int i = 0; i < numGames; i++) {
            System.out.print("Game " + (i + 1) + " - Enter your choice (rock, paper, scissors): ");
            String playerChoice = scanner.nextLine().toLowerCase();

            while (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.print("Invalid choice. Please enter rock, paper, or scissors: ");
                playerChoice = scanner.nextLine().toLowerCase();
            }

            String computerChoice = getComputerChoice();
            String winner = determineWinner(playerChoice, computerChoice);

            userChoices[i] = playerChoice;
            computerChoices[i] = computerChoice;

            if (winner.equals("player")) {
                playerWins++;
            } else if (winner.equals("computer")) {
                computerWins++;
            } else {
                ties++;
            }

            winners[i] = winner.equals("tie") ? "Tie" : (winner.equals("player") ? "Player" : "Computer");
        }

        String[][] stats = calculateStats(playerWins, computerWins, ties, numGames);
        displayResults(userChoices, computerChoices, winners, stats);

        scanner.close();
    }
}
