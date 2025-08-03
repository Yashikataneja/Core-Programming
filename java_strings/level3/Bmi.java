import java.util.Scanner;

public class Bmi{

    public static String[][] calculateBMIStatus(double[][] weightAndHeight) {
        int n = weightAndHeight.length;
        String[][] result = new String[n][4];

        for (int i = 0; i < n; i++) {
            double weight = weightAndHeight[i][0];
            double heightCm = weightAndHeight[i][1];
            double heightM = heightCm / 100.0;

            // BMI formula
            double bmi = weight / (heightM * heightM);

            bmi = Math.round(bmi * 100.0) / 100.0;

            // Determine BMI status
            String status;
            if (bmi <= 18.4) {
                status = "Underweight";
            } else if (bmi <= 24.9) {
                status = "Normal";
            } else if (bmi <= 39.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }


            result[i][0] = String.format("%.2f", heightCm);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static String[][] processBMIData(double[][] weightAndHeight) {

        return calculateBMIStatus(weightAndHeight);
    }

    public static void displayBMIData(String[][] data) {
        System.out.println("Height(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("-----------------------------------------------------------");
        for (String[] row : data) {
            System.out.printf("%s\t\t%s\t\t%s\t\t%s\n",
                    row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numPersons = 10;
        double[][] weightAndHeight = new double[numPersons][2]; // [weight, height]

        System.out.println("Enter weight (kg) and height (cm) for " + numPersons + " person(s):");

        for (int i = 0; i < numPersons; i++) {
            System.out.print("Person " + (i + 1) + " weight (kg): ");
            weightAndHeight[i][0] = scanner.nextDouble();

            System.out.print("Person " + (i + 1) + " height (cm): ");
            weightAndHeight[i][1] = scanner.nextDouble();
        }

        String[][] bmiData = processBMIData(weightAndHeight);

        System.out.println("\nBMI Report:");
        displayBMIData(bmiData);

        scanner.close();
    }
}
