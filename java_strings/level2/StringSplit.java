import java.util.Scanner;

public class StringSplit {
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
        spaceIndexes[0] = -1; // to handle substring from start to first space
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
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;

        for(int i = 0; i < arr1.length; i++) {
            if(!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the complete text: ");
        String input = scanner.nextLine();

        String[] customSplit = splitBySpaceCustom(input);

        String[] builtinSplit = input.split(" ");

        boolean isEqual = compareStringArrays(customSplit, builtinSplit);

        System.out.println("Words by custom split method:");
        for (String word : customSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords by built-in split method:");
        for (String word : builtinSplit) {
            System.out.println(word);
        }

        System.out.println("\nBoth split results are equal: " + isEqual);

        scanner.close();
    }
}
