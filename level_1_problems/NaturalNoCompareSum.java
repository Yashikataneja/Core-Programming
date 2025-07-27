import java.util.Scanner;

public class NaturalNoCompareSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n >= 1) {
            int formulaSum = n * (n + 1) / 2;

            int i = 1;
            int loopSum = 0;
            while (i <= n) {
                loopSum += i;
                i++;
            }
            System.out.println("Sum calculated using formula: " + formulaSum);
            System.out.println("Sum calculated using while loop: " + loopSum);
            if (formulaSum == loopSum) {
                System.out.println("Both computations are correct and equal.");
            } else {
                System.out.println("There is a mismatch in the results!");
            }
        } else {
            System.out.println("The number " + n + " is not a natural number.");
        }
    }
}

