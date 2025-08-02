import java.util.Scanner;

public class IllegalArguement {
    public static void generateException(String text) {
        System.out.println("Trying to get substring from index 5 to 3:");
        String result = text.substring(5, 3); // This causes IllegalArgumentException
        System.out.println("Substring: " + result);
    }
    public static void handleException(String text) {
        try {
            System.out.println("Trying to get substring from index 5 to 3:");
            String result = text.substring(5, 3); // This causes IllegalArgumentException
            System.out.println("Substring: " + result);
        } catch(IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught! Start index cannot be greater than end index.");
        } catch(RuntimeException e) {
            System.out.println("Some other runtime exception occurred: " + e);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();

        handleException(input);
    }
}
