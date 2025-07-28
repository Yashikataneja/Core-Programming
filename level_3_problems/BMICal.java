import java.util.Scanner;

public class BMICal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in cm: ");
        double heightCm = sc.nextDouble();
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi <= 18.4) {
            status = "UNDERWEIGHT";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            status = "NORMAL";
        } else if (bmi >= 25.0 && bmi <= 39.9) {
            status = "OVERWEIGHT";
        } else {
            status = "OBESE";
        }
        System.out.printf("Your BMI is: %.2f%n", bmi);
        System.out.println("Weight Status: " + status);

        sc.close();
    }
}
