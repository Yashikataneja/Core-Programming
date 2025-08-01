import java.util.Random;

public class ZaraCal {
    public static double[][] generateEmployeeData(int numEmployees) {
        double[][] data = new double[numEmployees][2];

        Random rand = new Random();

        for (int i = 0; i < numEmployees; i++) {
            double salary = 10000 + rand.nextInt(90000);
            int years = 1 + rand.nextInt(10);

            data[i][0] = salary;
            data[i][1] = years;
        }

        return data;
    }
    public static double[][] calculateBonusAndNewSalary(double[][] data) {
        int numEmployees = data.length;
        double[][] result = new double[numEmployees][3];

        for (int i = 0; i < numEmployees; i++) {
            double salary = data[i][0];
            int years = (int) data[i][1];

            double bonusPercent = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusPercent;
            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
            result[i][2] = bonusPercent * 100;
        }

        return result;
    }
    public static void printReport(double[][] originalData, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-15s %-15s\n",
                "EmpID", "Salary", "Years", "Bonus%", "Bonus Amount", "New Salary");
        System.out.println("-------------------------------------------------------------------------------------");

        for (int i = 0; i < originalData.length; i++) {
            double oldSalary = originalData[i][0];
            int years = (int) originalData[i][1];
            double bonusPercent = bonusData[i][2];
            double bonusAmount = bonusData[i][0];
            double newSalary = bonusData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonusAmount;

            System.out.printf("%-10d %-10.2f %-10d %-10.0f %-15.2f %-15.2f\n",
                    (i + 1), oldSalary, years, bonusPercent, bonusAmount, newSalary);
        }

        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("%-10s %-10.2f %-10s %-10s %-15.2f %-15.2f\n",
                "TOTAL", totalOldSalary, "", "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        double[][] originalData = generateEmployeeData(numEmployees);
        double[][] bonusData = calculateBonusAndNewSalary(originalData);

        printReport(originalData, bonusData);
    }
}
