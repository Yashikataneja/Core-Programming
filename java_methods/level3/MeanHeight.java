import java.util.Random; // To generate random numbers

public class MeanHeight {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150;  // 150 to 250
        }
        System.out.println("Player Heights:");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + ": " + heights[i] + " cm");
        }
        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            sum = sum + heights[i];
        }
        double mean = (double) sum / heights.length;
        int shortest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }
        int tallest = heights[0];
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }
        System.out.println("\n--- Team Stats ---");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
        System.out.printf("Mean Height: %.2f cm\n", mean);  // Displaying mean with 2 decimal places
    }
}
