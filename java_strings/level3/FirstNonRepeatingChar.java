import java.util.Scanner;

public class FirstNonRepeatingChar{
    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256]; // ASCII character frequencies

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            frequency[ch]++;
        }

       //first character with frequency 1
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }

        // If no non-repeating character found, return special char
        return '\0'; // null char means not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputText = scanner.nextLine();

        char result = findFirstNonRepeatingChar(inputText);

        if (result == '\0') {
            System.out.println("No non-repeating character found in the string.");
        } else {
            System.out.println("The first non-repeating character is: " + result);
        }

        scanner.close();
    }
}
