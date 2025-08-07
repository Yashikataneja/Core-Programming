import java.util.Scanner;

public class TempConvertor {

    // Function to convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Function to display the menu and get user's choice
    public static int getChoice(Scanner scanner) {
        System.out.println("Temperature Converter");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.print("Enter your choice (1 or 2): ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = getChoice(scanner);

        switch (choice) {
            case 1:
                System.out.print("Enter temperature in Fahrenheit: ");
                double f = scanner.nextDouble();
                double c = fahrenheitToCelsius(f);
                System.out.printf("%.2f Fahrenheit = %.2f Celsius%n", f, c);
                break;

            case 2:
                System.out.print("Enter temperature in Celsius: ");
                double celsius = scanner.nextDouble();
                double fahrenheit = celsiusToFahrenheit(celsius);
                System.out.printf("%.2f Celsius = %.2f Fahrenheit%n", celsius, fahrenheit);
                break;

            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
