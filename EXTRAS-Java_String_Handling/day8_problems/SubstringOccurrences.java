import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainString = sc.nextLine();

        System.out.print("Enter the substring to find: ");
        String subString = sc.nextLine();

        int count = 0;
        int index = 0;

        // Loop to find all occurrences
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index = index + subString.length(); // Move past the last found substring
        }

        System.out.println("The substring occurs " + count + " times.");

        sc.close();
    }
}
