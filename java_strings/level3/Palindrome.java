import java.util.Scanner;

public class Palindrome {

    // Logic 1: Iterative method to check palindrome by comparing start and end characters
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;  // Base case: All characters matched
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false; // Characters don't match
        }
        // Recursive call moving inward
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3a: Method to reverse string using charAt()
    public static char[] reverseStringUsingCharAt(String text) {
        int length = text.length();
        char[] reversed = new char[length];
        for (int i = 0; i < length; i++) {
            reversed[i] = text.charAt(length - 1 - i);
        }
        return reversed;
    }

    // Logic 3b: Method to check palindrome by comparing original and reversed char arrays
    public static boolean isPalindromeUsingCharArrays(String text) {
        char[] originalArray = text.toCharArray();
        char[] reversedArray = reverseStringUsingCharAt(text);

        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] != reversedArray[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a text to check palindrome: ");
        String inputText = scanner.nextLine();

        String text = inputText.replaceAll("\\s+", "").toLowerCase();

        boolean iterativeResult = isPalindromeIterative(text);
        boolean recursiveResult = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean arrayComparisonResult = isPalindromeUsingCharArrays(text);

        System.out.println("\nPalindrome Check Results:");
        System.out.println("--------------------------");
        System.out.println("Using iterative method : " + (iterativeResult ? "Palindrome" : "Not palindrome"));
        System.out.println("Using recursive method : " + (recursiveResult ? "Palindrome" : "Not palindrome"));
        System.out.println("Using char arrays      : " + (arrayComparisonResult ? "Palindrome" : "Not palindrome"));

        scanner.close();
    }
}
