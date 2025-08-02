import java.util.Scanner;

public class ArrayIndexOutOfBound {
    public static void generateException(String[] names) {
        System.out.println("Accessing invalid index: " + names[names.length]);
    }
    public static void handleException(String[] names) {
        try {
            System.out.println("Accessing invalid index: " + names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught! You tried to access an invalid array index.");
        } catch (RuntimeException e) {
            System.out.println("Some other runtime exception occurred: " + e);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int n = scanner.nextInt();

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            names[i] = scanner.next();
        }
        handleException(names);

        scanner.close();
    }
}

