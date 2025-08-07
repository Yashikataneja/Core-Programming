import java.util.Scanner;

public class GcdLcm{
    public static int[] getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        return new int[]{num1, num2};
    }

    // Function to calculate GCD using Euclidean algorithm
    public static int calculateGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculateGCD(b, a % b);
    }

    // Function to calculate LCM using the relation: LCM(a, b) = (a * b) / GCD(a, b)
    public static int calculateLCM(int a, int b) {
        return (a * b) / calculateGCD(a, b);
    }

    public static void displayResult(int a, int b, int gcd, int lcm) {
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
        System.out.println("LCM of " + a + " and " + b + " is: " + lcm);
    }
    public static void main(String[] args) {
        int[] inputs = getInput();
        int num1 = inputs[0];
        int num2 = inputs[1];

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Please enter positive integers only.");
        } else {
            int gcd = calculateGCD(num1, num2);
            int lcm = calculateLCM(num1, num2);
            displayResult(num1, num2, gcd, lcm);
        }
    }
}

