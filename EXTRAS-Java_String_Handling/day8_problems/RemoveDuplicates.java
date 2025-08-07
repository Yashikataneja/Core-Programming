import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert the string to a new string without duplicates
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Check if character is already in result
            if (result.indexOf(currentChar) == -1) {
                result = result + currentChar;
            }
        }
        System.out.println("String after removing duplicates: " + result);

        sc.close();
    }
}
