import java.util.Scanner;

public class ManualTrimString {
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end};
    }
    public static String manualSubstring(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
    public static boolean manualCompare(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with trailing spaces: ");
        String input = sc.nextLine();

        int[] indices = findTrimIndices(input);
        int start = indices[0], end = indices[1];

        String trimmedCustom;
        if (start > end) {
            trimmedCustom = "";
        } else {

            trimmedCustom = manualSubstring(input, start, end);
        }

        String trimmedBuiltIn = input.trim();


        boolean isEqual = manualCompare(trimmedCustom, trimmedBuiltIn);


        System.out.println("Manual Trim Result: >" + trimmedCustom + "<");
        System.out.println("Built-in Trim Result: >" + trimmedBuiltIn + "<");
        System.out.println("Are both trimmed strings equal? " + isEqual);
        System.out.println("Manual trim indices: " + start + " to " + end);
    }
}
