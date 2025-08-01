
import java.util.Scanner;

public class LineAndDistance {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2];

        if (x2 == x1) {
            throw new ArithmeticException("Slope is undefined (vertical line).");
        }

        double m = (y2 - y1) / (x2 - x1);
        double b = y1 - m * x1;
        result[0] = m;
        result[1] = b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();

        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance: %.2f\n", distance);

        try {
            double[] line = calculateLineEquation(x1, y1, x2, y2);
            double m = line[0];
            double b = line[1];
            System.out.printf("Equation of the Line: y = %.2fx + %.2f\n", m, b);
        } catch (ArithmeticException e) {
            System.out.println("Cannot compute line equation: " + e.getMessage());
        }

        sc.close();
    }
}
