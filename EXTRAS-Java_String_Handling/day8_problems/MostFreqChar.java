import java.util.Scanner;

public class MostFreqChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase to treat 'A' and 'a' as the same (optional)
        input = input.toLowerCase();

        int[] freq = new int[256]; // ASCII size
        int maxFreq = 0;
        char mostFrequent = ' ';

        // Count frequency of each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            freq[ch]++;

            // Update most frequent character
            if (freq[ch] > maxFreq) {
                maxFreq = freq[ch];
                mostFrequent = ch;
            }
        }

        System.out.println("Most Frequent Character: '" + mostFrequent + "'");

        sc.close();
    }
}
