import java.util.Scanner;
import java.util.Random;

public class Vote {
    public static int[] generateRandomAges(int n) {
        int[] ages = new int[n];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) + 10;
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            result[i][0] = String.valueOf(age);
            if (age < 0) {
                result[i][1] = "false";
            } else if (age >= 18) {
                result[i][1] = "true"; // Can vote
            } else {
                result[i][1] = "false"; // Cannot vote
            }
        }
        return result;
    }

    public static void displayResult(String[][] data) {
        System.out.println("Age\tCan Vote?");
        System.out.println("----------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int NUM_STUDENTS = 10;

        System.out.println("Choose input method:");
        System.out.println("1. Enter ages manually");
        System.out.println("2. Generate random ages");
        System.out.print("Enter 1 or 2: ");
        int choice = scanner.nextInt();

        int[] ages = new int[NUM_STUDENTS];

        if (choice == 1) {
            System.out.println("Enter the ages of " + NUM_STUDENTS + " students:");
            for (int i = 0; i < NUM_STUDENTS; i++) {
                System.out.print("Age of student " + (i + 1) + ": ");
                ages[i] = scanner.nextInt();
            }
        } else if (choice == 2) {
            ages = generateRandomAges(NUM_STUDENTS);
            System.out.println("Randomly generated ages:");
            for (int age : ages) {
                System.out.print(age + " ");
            }
            System.out.println();
        } else {
            System.out.println("Invalid choice. Exiting.");
            scanner.close();
            return;
        }
        String[][] results = checkVotingEligibility(ages);
        displayResult(results);

        scanner.close();
    }
}

