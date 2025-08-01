import java.util.Scanner;

public class SimpleSubstring {
    public static String makeSubstringWithCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end && i < text.length(); i++) {
            result = result + text.charAt(i);
        }
        return result;
    }
    public static boolean areStringsSame(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String text = scanner.next();

        System.out.print("Enter start index: ");
        int start = scanner.nextInt();

        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        String manualSub = makeSubstringWithCharAt(text, start, end);

        String builtInSub = "";
        if (start >= 0 && end <= text.length() && start < end) {
            builtInSub = text.substring(start, end);
        } else {
            System.out.println("Invalid index values!");
            return;
        }

        System.out.println("Substring with charAt(): " + manualSub);
        System.out.println("Substring with substring(): " + builtInSub);

        boolean same = areStringsSame(manualSub, builtInSub);
        System.out.println("Are both substrings equal? " + same);

        scanner.close();
    }
}

