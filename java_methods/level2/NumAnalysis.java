import java.util.Scanner;

public class NumAnalysis {
    public static boolean isPositive(int num) {
        return num >= 0;
    }
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];
            if (isPositive(num)) {
                System.out.print("Number " + num + " is positive and ");
                if (isEven(num)) {
                    System.out.println("even.");
                } else {
                    System.out.println("odd.");
                }
            } else {
                System.out.println("Number " + num + " is negative.");
            }
        }

        int comparison = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("Comparison of first and last numbers: ");
        if (comparison == 1) {
            System.out.println(numbers[0] + " is greater than " + numbers[numbers.length - 1]);
        } else if (comparison == 0) {
            System.out.println(numbers[0] + " is equal to " + numbers[numbers.length - 1]);
        } else {
            System.out.println(numbers[0] + " is less than " + numbers[numbers.length - 1]);
        }

        input.close();
    }
}
