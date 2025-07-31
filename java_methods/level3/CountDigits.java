public class CountDigits {
    public static int countDigits(int number) {
        int count = 0;
        number = Math.abs(number);
        if (number == 0) return 1;
        while (number != 0) {
            count++;
            number /= 10;
        }
        return count;
    }
    public static int[] getDigitsArray(int number) {
        int n = Math.abs(number);
        int[] digits = new int[countDigits(n)];
        int i = digits.length - 1;
        do {
            digits[i--] = n % 10;
            n /= 10;
        } while (n > 0);
        return digits;
    }
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversed);
    }
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigitsArray(number);
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        int number1 = 12321;
        int number2 = 1023;

        System.out.println("Number: " + number1 + " has " + countDigits(number1) + " digits");
        int[] digits1 = getDigitsArray(number1);
        System.out.print("Digits of " + number1 + ": ");
        for (int d : digits1) System.out.print(d + " ");
        System.out.println();

        // Reverse digits array
        int[] reversed1 = reverseDigitsArray(digits1);
        System.out.print("Reversed digits: ");
        for (int d : reversed1) System.out.print(d + " ");
        System.out.println();

        // Compare arrays
        int[] digits2 = getDigitsArray(number2);
        System.out.println("Digits of " + number1 + " and " + number2 + " are equal? " + areArraysEqual(digits1, digits2));

        // Palindrome
        System.out.println(number1 + " is palindrome? " + isPalindrome(number1));
        System.out.println(number2 + " is palindrome? " + isPalindrome(number2));

         //Duck number
        System.out.println(number1 + " is a duck number? " + isDuckNumber(number1));
        System.out.println(number2 + " is a duck number? " + isDuckNumber(number2));
    }
}
