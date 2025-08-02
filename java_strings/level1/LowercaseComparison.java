import java.util.Scanner;

public class LowercaseComparison {
    public static String toLowerCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }
            result.append(ch);
        }
        return result.toString();
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the complete text: ");
        String inputText = scanner.nextLine();

        String customLowercase = toLowerCaseCustom(inputText);

        String builtinLowercase = inputText.toLowerCase();

        boolean isEqual = compareStrings(customLowercase, builtinLowercase);

        System.out.println("Lowercase by custom method: " + customLowercase);
        System.out.println("Lowercase by built-in method: " + builtinLowercase);
        System.out.println("Both lowercase strings are equal: " + isEqual);

        scanner.close();
    }
}

