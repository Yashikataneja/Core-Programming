import java.util.Scanner;

public class Calendar {

    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        };
        if (month >= 1 && month <= 12) {
            return months[month - 1];
        } else {
            return "Invalid Month";
        }
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 400) == 0) {
            return true;
        } else if ((year % 100) == 0) {
            return false;
        } else return (year % 4) == 0;
    }

    // Method to get the number of days in the month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonths = {
                31, 28, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        if (month >= 1 && month <= 12) {
            return daysInMonths[month - 1];
        }
        return 0;
    }


    // Using Gregorian calendar formula
    public static int getFirstDayOfMonth(int month, int year) {
        int m = month;
        int y = year;
        int d = 1;  // First day of month

        if (m < 3) {
            m += 12;
            y -= 1;
        }

        int k = y % 100;      // Year within century
        int j = y / 100;      // Zero-based century

        // Zeller's Congruence formula for Gregorian calendar
        int f = d + ((13 * (m + 1)) / 5) + k + (k / 4) + (j / 4) + (5 * j);
        int dayOfWeek = f % 7;


        int convertedDay = (dayOfWeek + 6) % 7;
        return convertedDay;
    }

    public static void displayCalendar(int month, int year) {
        System.out.printf("\n    %s %d\n", getMonthName(month), year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getNumberOfDays(month, year);


        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }


        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month entered!");
        } else if (year < 1) {
            System.out.println("Invalid year entered!");
        } else {
            displayCalendar(month, year);
        }

        scanner.close();
    }
}
