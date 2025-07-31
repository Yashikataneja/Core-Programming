import java.util.Scanner;

public class NumberChecker {
    public static int countDigits(int number) {
        int count = 0;
        int temp = number;
        while (temp > 0) {
            count++;
            temp /= 10;
        }
        return count;
    }
    public static int[] getDigitsArray(int number, int count) {
        int[] digits = new int[count];
        int index = count - 1;
        while (number > 0) {
            digits[index] = number % 10;
            number = number / 10;
            index--;
        }
        return digits;
    }
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { // Start from 1 to avoid leading zero
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean isArmstrong(int number, int[] digits) {
        int sum = 0;
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }
    public static void findTwoLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }
    public static void findTwoSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + secondSmallest);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int number = sc.nextInt();


        int count = countDigits(number);
        System.out.println("Number of Digits: " + count);

        int[] digits = getDigitsArray(number, count);


        if (isDuckNumber(digits)) {
            System.out.println(number + " is a Duck Number.");
        } else {
            System.out.println(number + " is NOT a Duck Number.");
        }


        if (isArmstrong(number, digits)) {
            System.out.println(number + " is an Armstrong Number.");
        } else {
            System.out.println(number + " is NOT an Armstrong Number.");
        }
        findTwoLargest(digits);
        findTwoSmallest(digits);

        sc.close();
    }
}
