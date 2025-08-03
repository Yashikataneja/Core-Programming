import java.util.Scanner;

public class VowelConsonantType {
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char)(ch + 32); // Convert uppercase to lowercase
        }
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                return "Vowel";
            else
                return "Consonant";
        } else {
            return "Not a Letter";
        }
    }
    public static String[][] analyzeString(String str) {
        int len = str.length();
        String[][] result = new String[len][2];
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            result[i][0] = String.valueOf(ch);
            result[i][1] = checkCharType(ch);
        }
        return result;
    }
    public static void displayTable(String[][] table) {
        System.out.printf("%-10s | %-15s\n", "Character", "Type");
        System.out.println("-----------------------------");
        for (int i = 0; i < table.length; i++) {
            System.out.printf("%-10s | %-15s\n", table[i][0], table[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[][] charTable = analyzeString(input);

        displayTable(charTable);
    }
}

