import java.util.Scanner;

public class MultiplicationTabFrom6To9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int[] multiplicationResult = new int[4];
        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (6 + i);
        }
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " * " + (6 + i) + " = " + multiplicationResult[i]);
        }
        scanner.close();
    }
}

