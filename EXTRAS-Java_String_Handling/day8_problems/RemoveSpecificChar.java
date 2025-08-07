import java.util.Scanner;

public class RemoveSpecificChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = sc.next().charAt(0);

        String result = "";

        // Build new string without the specified character
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != charToRemove) {
                result = result + input.charAt(i);
            }
        }
        System.out.println("Modified String: " + result);

        sc.close();
    }
}
