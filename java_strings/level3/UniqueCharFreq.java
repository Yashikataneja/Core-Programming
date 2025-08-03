import java.util.Scanner;

public class UniqueCharFreq{
    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] tempUnique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (tempUnique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                tempUnique[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }
        char[] uniqueChars = new char[uniqueCount];
        System.arraycopy(tempUnique, 0, uniqueChars, 0, uniqueCount);

        return uniqueChars;
    }

    public static String[][] findFrequency(String text, char[] uniqueChars) {
        int[] freq = new int[256];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }
        String[][] charFreq = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            charFreq[i][0] = Character.toString(uniqueChars[i]);
            charFreq[i][1] = Integer.toString(freq[uniqueChars[i]]);
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

        char[] uniqueChars = findUniqueCharacters(inputText);

        String[][] frequency = findFrequency(inputText, uniqueChars);

        System.out.println("\nCharacter Frequencies based on unique characters:");
        displayFrequency(frequency);

        scanner.close();
    }
}
