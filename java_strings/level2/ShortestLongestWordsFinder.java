import java.util.Scanner;

public class ShortestLongestWordsFinder {
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
        spaceIndexes[0] = -1;  // before first word

        int idx = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[idx++] = i;
            }
        }
        spaceIndexes[idx] = length;
        for (int w = 0; w < words.length; w++) {
            int start = spaceIndexes[w] + 1;
            int end = spaceIndexes[w + 1];
            StringBuilder word = new StringBuilder();
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
    public static int[] findShortestAndLongest(String[][] wordsLenArr) {
        if (wordsLenArr.length == 0) {
            return new int[] {-1, -1};
        }

        int shortestIndex = 0;
        int longestIndex = 0;
        int shortestLen = Integer.parseInt(wordsLenArr[0][1]);
        int longestLen = shortestLen;

        for (int i = 1; i < wordsLenArr.length; i++) {
            int currentLen = Integer.parseInt(wordsLenArr[i][1]);
            if (currentLen < shortestLen) {
                shortestLen = currentLen;
                shortestIndex = i;
            }
            if (currentLen > longestLen) {
                longestLen = currentLen;
                longestIndex = i;
            }
        }
        return new int[] {shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter complete text: ");
        String input = scanner.nextLine();

        String[] words = splitBySpaceCustom(input);
        String[][] wordsLenArray = wordsWithLengths(words);

        int[] indexes = findShortestAndLongest(wordsLenArray);

        if (indexes[0] == -1) {
            System.out.println("No words found.");
        } else {
            System.out.println("\nResults:");
            System.out.println("Shortest word: " + wordsLenArray[indexes[0]][0]
                    + " (Length: " + wordsLenArray[indexes[0]][1] + ")");
            System.out.println("Longest word: " + wordsLenArray[indexes[1]][0]
                    + " (Length: " + wordsLenArray[indexes[1]][1] + ")");
        }

        scanner.close();
    }
}

