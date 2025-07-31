public class NumChecker2 {
    public static int countDigits(int number) {
        int count = 0;
        int n = Math.abs(number);
        if (n == 0) return 1;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
    public static int[] getDigitsArray(int number) {
        int n = Math.abs(number);
        int count = countDigits(n);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = n % 10;
            n = n / 10;
        }
        return digits;
    }
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        if (sum == 0) return false; // prevent division by zero
        return (number % sum == 0);
    }
    public static int[][] digitFrequencies(int[] digits) {
        int[] freq = new int[10]; // For digits 0-9
        for (int digit : digits) {
            freq[digit]++;
        }
        int unique = 0;
        for (int f : freq) if (f > 0) unique++;

        int[][] result = new int[unique][2];
        int index = 0;
        for (int digit = 0; digit < 10; digit++) {
            if (freq[digit] > 0) {
                result[index][0] = digit;
                result[index][1] = freq[digit];
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int number = 22110;
        System.out.println("Number: " + number);

        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        int[] digits = getDigitsArray(number);
        System.out.print("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();

        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);

        int sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad number? " + (isHarshad ? "Yes" : "No"));

        System.out.println("Digit frequencies:");
        int[][] frequencies = digitFrequencies(digits);
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("Digit " + frequencies[i][0] + ": " + frequencies[i][1] + " times");
        }
    }
}

