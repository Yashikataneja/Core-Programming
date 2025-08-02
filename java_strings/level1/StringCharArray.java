import java.util.Scanner;
import java.util.Arrays;

public class StringCharArray {
    public static char[] getCharsFromString(String str) {
        char[] charArray = new char[str.length()];
        for(int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if(arr1.length != arr2.length) return false;
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String userInput = scanner.next();
        char[] userChars = getCharsFromString(userInput);
        char[] builtInChars = userInput.toCharArray();
        boolean areSame = compareCharArrays(userChars, builtInChars);
        System.out.println("Characters using user-defined method: " + Arrays.toString(userChars));
        System.out.println("Characters using toCharArray(): " + Arrays.toString(builtInChars));
        System.out.println("Both arrays are the same: " + areSame);

        scanner.close();
    }
}
