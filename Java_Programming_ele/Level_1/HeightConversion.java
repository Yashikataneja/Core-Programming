import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        final int INCHES_PER_FOOT = 12;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();
        int totalInches = (int) (heightCm / CM_PER_INCH);

        int feet = totalInches / INCHES_PER_FOOT;
        int inches = totalInches % INCHES_PER_FOOT;

        System.out.printf("Height in cm is %.2f while in feet is %d and inches is %d%n",
                heightCm, feet, inches);

        input.close();
    }
}
