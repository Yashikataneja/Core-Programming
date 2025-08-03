import java.util.Scanner;

public class StringLengthWithoutLengthMethod {
    public static int findLength(String text) {
        int count = 0;
        while (true) {
            try {
                char ch = text.charAt(count);
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.next();

        int customLength = findLength(input);
        int builtinLength = input.length();

        System.out.println("Custom calculated length: " + customLength);
        System.out.println("Built-in length(): " + builtinLength);

        scanner.close();
    }
}
