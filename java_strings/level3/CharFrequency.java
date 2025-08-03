import java.util.Scanner;

public class CharFrequency {
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256];


        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        int uniqueCharCount = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                uniqueCharCount++;
            }
        }

        String[][] charFreq = new String[uniqueCharCount][2];
        int index = 0;

        for (int i = 0; i < 256; i++) {
            if (freq[i] > 0) {
                charFreq[index][0] = Character.toString((char)i);
                charFreq[index][1] = Integer.toString(freq[i]);
                index++;
            }
        }

        return charFreq;
    }
    public static void displayFrequency(String[][] charFreq) {
        System.out.println("Character\tFrequency");
        System.out.println("-------------------------");
        for (int i = 0; i < charFreq.length; i++) {
            System.out.printf("%-10s\t%s\n", charFreq[i][0], charFreq[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        String[][] frequency = findFrequency(inputText);

        System.out.println("\nCharacter Frequencies:");
        displayFrequency(frequency);

        scanner.close();
    }
}
