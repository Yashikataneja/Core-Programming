public class PrimeCheck {
    public static int[] getDigits(int number) {
        number = Math.abs(number);
        int length = String.valueOf(number).length();
        int[] digits = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }
    public static boolean isSpyNumber(int number) {
        int[] digits = getDigits(number);
        int sum = 0, product = 1;
        for (int d : digits) {
            sum += d;
            product *= d;
        }
        return sum == product;
    }
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String sqStr = String.valueOf(square);
        return sqStr.endsWith(numStr);
    }
    public static boolean isBuzzNumber(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }
    public static void main(String[] args) {
        int[] testNums = {7, 9, 153, 370, 5, 49};

        for (int num : testNums) {
            System.out.println("Number: " + num);
            System.out.println("Prime? " + isPrime(num));
            System.out.println("Neon? " + isNeon(num));
            System.out.println("Spy? " + isSpyNumber(num));
            System.out.println("Automorphic? " + isAutomorphic(num));
            System.out.println("Buzz? " + isBuzzNumber(num));
            System.out.println("-------------------");
        }
    }
}
