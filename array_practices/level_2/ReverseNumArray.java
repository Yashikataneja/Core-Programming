import java.util.Scanner;

public class ReverseNumArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String numStr = scanner.nextLine();
        int length = numStr.length();
        int[] digits = new int[length];
        for (int i = 0; i < length; i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        int[] reversedDigits = new int[length];
        for (int i = 0; i < length; i++) {
            reversedDigits[i] = digits[length - 1 - i];
        }
        System.out.print("Reversed digits array: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        scanner.close();
    }
}
