import java.util.Scanner;

public class CharFreqNested {

    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int length = chars.length;
        int[] freq = new int[length];

        for (int i = 0; i < length; i++) {
            if (chars[i] == '0') {

                freq[i] = 0;
                continue;
            }
            freq[i] = 1;
            for (int j = i + 1; j < length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int countUnique = 0;
        for (int i = 0; i < length; i++) {
            if (freq[i] > 0) {
                countUnique++;
            }
        }

        String[] result = new String[countUnique];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (freq[i] > 0) {
                result[index++] = chars[i] + ": " + freq[i];
            }
        }

        return result;
    }
    public static void displayFrequency(String[] frequency) {
        System.out.println("Character Frequency:");
        System.out.println("--------------------");
        for (String entry : frequency) {
            System.out.println(entry);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String[] freqArray = findFrequency(input);

        displayFrequency(freqArray);

        scanner.close();
    }
}

