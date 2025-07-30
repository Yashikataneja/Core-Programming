import java.util.Scanner;

public class SumOfNatural{

    public static int sumNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            int result = sumNaturalNumbers(n);
            System.out.println("The sum of first " + n + " natural numbers is: " + result);
        }

        input.close();
    }
}

