import java.util.Scanner;

public class Bmi{
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0]; // weight in kg
            double heightCm = data[i][1]; // height in cm
            double heightM = heightCm / 100.0; // convert to meters

            // BMI : weight / (height_in_meters^2)
            double bmi = weight / (heightM * heightM);
            data[i][2] = bmi;
        }
    }
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];

        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];

            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi <= 39.9) {
                status[i] = "Overweight";
            } else { // bmi >= 40.0
                status[i] = "Obese";
            }
        }

        return status;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] peopleData = new double[10][3];


        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

            System.out.print("Weight in kilograms: ");
            peopleData[i][0] = input.nextDouble();

            System.out.print("Height in centimeters: ");
            peopleData[i][1] = input.nextDouble();
        }


        calculateBMI(peopleData);


        String[] bmiStatus = determineBMIStatus(peopleData);


        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n",
                    peopleData[i][0], peopleData[i][1], peopleData[i][2], bmiStatus[i]);
        }

        input.close();
    }
}
