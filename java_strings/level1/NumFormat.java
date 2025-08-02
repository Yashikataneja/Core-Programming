import java.util.Scanner;

public class NumFormat {
    public static void generateException(String text) {
        int number = Integer.parseInt(text);
        System.out.println("Extracted number: " + number);
    }
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Extracted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught! The provided text is not a valid integer.");
        } catch (RuntimeException e) {
            System.out.println("Some other runtime exception occurred: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number as text: ");
        String input = scanner.next();
        handleException(input);
    }
}
