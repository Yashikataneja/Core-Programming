import java.util.Scanner;

public class WordsWithLength {
    public static int findLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }
    public static String[] splitBySpaceCustom(String text) {
        int length = findLength(text);
        int spaceCount = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        String[] words = new String[spaceCount + 1];
        int[] spaceIndexes = new int[spaceCount + 2];
        spaceIndexes[0] = -1;

        int idx = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx] = i;
                idx++;
            }
        }
        spaceIndexes[idx] = length;
        for (int w = 0; w < words.length; w++) {
            StringBuilder word = new StringBuilder();
            int start = spaceIndexes[w] + 1;
            int end = spaceIndexes[w + 1];

            for (int j = start; j < end; j++) {
                word.append(text.charAt(j));
            }
            words[w] = word.toString();
        }
        return words;
    }
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            int length = findLength(words[i]);
            result[i][0] = words[i];
            result[i][1] = String.valueOf(length);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a complete line of text: ");
        String input = scanner.nextLine();

        String[] words = splitBySpaceCustom(input);

        String[][] wordsLengthArray = wordsWithLengths(words);
        System.out.println("\nWord\tLength");
        System.out.println("-----------------");
        for (int i = 0; i < wordsLengthArray.length; i++) {
            String word = wordsLengthArray[i][0];
            int length = Integer.parseInt(wordsLengthArray[i][1]); // Convert length back to int
            System.out.printf("%s\t%d\n", word, length);
        }

        scanner.close();
    }
}
