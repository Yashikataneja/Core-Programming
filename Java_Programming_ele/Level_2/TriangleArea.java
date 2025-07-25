import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (in inches): ");
        float base = scanner.nextFloat();

        System.out.print("Enter the height of the triangle (in inches): ");
        float height = scanner.nextFloat();

        float areaInch = 0.5f * base * height;


        // 1 inch = 2.54 cm, 1 sq in = 2.54^2 = 6.4516 sq cm
        float areaCm = areaInch * 6.4516f;


        float heightCm = height * 2.54f;
        float heightFeet = height / 12.0f;
        float heightInches = height;
        System.out.println("Area of the triangle: " + areaInch + " square inches or " + areaCm + " square centimeters.");
        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + heightFeet + " and inches is " + heightInches + ".");

        scanner.close();
    }
}

