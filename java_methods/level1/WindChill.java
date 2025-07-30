import java.util.Scanner;

public class WindChill{
    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  in Fahrenheit
        System.out.print("Enter the temperature in degrees Fahrenheit: ");
        double temperature = input.nextDouble();

        // wind speed in miles per hour
        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = input.nextDouble();

        double windChill = calculateWindChill(temperature, windSpeed);

        System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);

        input.close();
    }
}
