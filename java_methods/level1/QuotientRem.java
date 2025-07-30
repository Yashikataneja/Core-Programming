import java.util.Scanner;

public class QuotientRem{
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] {quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = input.nextInt();

        if (divisor == 0) {
            System.out.println("Divisor cannot be zero.");
        } else {
            int[] results = findRemainderAndQuotient(number, divisor);
            System.out.println("Quotient: " + results[0]);
            System.out.println("Remainder: " + results[1]);
        }

        input.close();
    }
}
