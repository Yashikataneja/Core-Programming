import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String result = "";

        // Loop through each character
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if character is uppercase
            if (Character.isUpperCase(ch)) {
                result = result + Character.toLowerCase(ch);
            }
            // Check if character is lowercase
            else if (Character.isLowerCase(ch)) {
                result = result + Character.toUpperCase(ch);
            }
            // If it's not a letter (like space, digit, symbol), keep it as it is
            else {
                result = result + ch;
            }
        }

        System.out.println("Toggled string: " + result);

        sc.close();
    }
}

