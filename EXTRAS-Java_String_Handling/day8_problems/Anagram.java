import java.util.Arrays;
import java.util.Scanner;

public class Anagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // Remove spaces and convert to lowercase for fair comparison
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different
        if (str1.length() != str2.length()) {
            System.out.println("The strings are NOT anagrams.");
        } else {
            // Convert strings to char arrays
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            // Sort the char arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("The strings are ANAGRAMS.");
            } else {
                System.out.println("The strings are NOT anagrams.");
            }
        }

        sc.close();
    }
}
