import java.util.Scanner;

public class FootballTeam {
    public static void main(String[] args) {
        double[] heights = new double[11];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
        }
        double sum = 0.0;
        for (double height : heights) {
            sum += height;
        }
        double mean = sum / heights.length;
        System.out.println("Mean height of the football team is: " + mean);

        scanner.close();
    }
}

