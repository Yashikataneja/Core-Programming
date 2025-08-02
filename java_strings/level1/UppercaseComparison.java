import java.util.Scanner;

public class UppercaseComparison {
    public static String toUpperCaseCustom(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char)(ch - 32);
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
        String customUppercase = toUpperCaseCustom(inputText);
        String builtinUppercase = inputText.toUpperCase();
        boolean isEqual = compareStrings(customUppercase, builtinUppercase);
        System.out.println("Uppercase by custom method: " + customUppercase);
        System.out.println("Uppercase by built-in method: " + builtinUppercase);
        System.out.println("Both uppercase strings are equal: " + isEqual);

        scanner.close();
    }
}
