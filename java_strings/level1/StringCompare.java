import java.util.Scanner;

public class StringCompare {
    public static boolean compareUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        boolean charAtResult = compareUsingCharAt(str1, str2);

        boolean equalsResult = str1.equals(str2);

        System.out.println("\nComparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsResult);

        if (charAtResult == equalsResult) {
            System.out.println("Both comparison methods returned the same result.");
        } else {
            System.out.println("Comparison results differ between charAt() and equals().");
        }

        sc.close();
    }
}
