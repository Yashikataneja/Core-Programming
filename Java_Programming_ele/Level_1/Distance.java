import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        float distanceInFeet = scanner.nextFloat();

        // feet to yards (1 yard = 3 feet)
        float distanceInYards = distanceInFeet / 3;

        // yards to miles (1 mile = 1760 yards)
        float distanceInMiles = distanceInYards / 1760;
        System.out.println("Distance in yards: " + distanceInYards);
        System.out.println("Distance in miles: " + distanceInMiles);

        scanner.close();
    }
}
