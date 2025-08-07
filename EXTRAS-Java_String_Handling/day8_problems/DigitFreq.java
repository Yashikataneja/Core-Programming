import java.util.Scanner;

public class DigitFreq{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Frequency array, 0-9
        int[] freq = new int[10];

        // Take absolute value to handle negative numbers
        num = Math.abs(num);

        // Brute force: extract digits one by one
        while (num > 0) {
            int digit = num % 10;   // Get last digit
            freq[digit]++;          // Increase frequency
            num = num / 10;         // Remove last digit
        }

        // Print results
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + ": " + freq[i]);
            }
        }
    }
}
