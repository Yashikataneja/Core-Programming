import java.util.Scanner;

public class PowCalWhile{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number (positive integer): ");
        int number = sc.nextInt();

        System.out.print("Enter the power (non-negative integer): ");
        int power = sc.nextInt();

        if (number < 0 || power < 0) {
            System.out.println("Both number and power should be non-negative integers.");
        } else {
            long result = 1;
            int counter = 0;

            while (counter < power) {
                result *= number;
                counter++;
            }

            System.out.println(number + " raised to the power " + power + " is " + result);
        }
    }
}

