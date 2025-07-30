import java.util.Scanner;

public class SpringSeason {

    // (March 20 to June 20)
    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20 && day <= 31) {
            return true;
        }
        if (month == 4 && day >= 1 && day <= 30) {
            return true;
        }
        if (month == 5 && day >= 1 && day <= 31) {
            return true;
        }
        if (month == 6 && day >= 1 && day <= 20) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();
        if (month < 1 || month > 12 || day < 1 || day > 31) {
            System.out.println("Invalid month or day entered.");
        } else {
            if (isSpringSeason(month, day)) {
                System.out.println("Its a Spring Season");
            } else {
                System.out.println("Not a Spring Season");
            }
        }

        input.close();
    }
}
