import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        // Formatter to parse date in yyyy-MM-dd format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String date1Input = sc.nextLine();

        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String date2Input = sc.nextLine();

        // Convert input strings to LocalDate
        LocalDate date1 = LocalDate.parse(date1Input, formatter);
        LocalDate date2 = LocalDate.parse(date2Input, formatter);

        if (date1.isBefore(date2)) {
            System.out.println("First date is BEFORE the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is AFTER the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("Both dates are EQUAL.");
        }

        sc.close();
    }
}
