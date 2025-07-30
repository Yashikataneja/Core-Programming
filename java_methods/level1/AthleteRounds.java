import java.util.Scanner;

public class AthleteRounds {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter side 1 (meters): ");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2 (meters): ");
        double side2 = input.nextDouble();
        System.out.print("Enter side 3 (meters): ");
        double side3 = input.nextDouble();
        double perimeter = side1 + side2 + side3;
        double totalDistance = 5000;
        int rounds = (int) Math.ceil(totalDistance / perimeter);
        System.out.println("The athlete must run " + rounds + " rounds to complete 5 km.");
        input.close();
    }
}
