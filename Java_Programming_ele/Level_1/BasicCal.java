import java.util.Scanner;

public class BasicCal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (number1): ");
        float number1 = scanner.nextFloat();
        System.out.print("Enter second number (number2): ");
        float number2 = scanner.nextFloat();
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", "
                + subtraction + ", "
                + multiplication + ", and "
                + division + ".");

        scanner.close();
    }
}
