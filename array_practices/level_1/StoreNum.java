import java.util.Scanner;

public class StoreNum{
    public static void main(String[] args) {
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = scanner.nextDouble();
            if (num <= 0) {
                break;
            }
            numbers[index] = num;
            index++;
            if (index == 10) {
                break;
            }
        }
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }
        System.out.println();
        System.out.println("Sum of all numbers: " + total);
        scanner.close();
    }
}
