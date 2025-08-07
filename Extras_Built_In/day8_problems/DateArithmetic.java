import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        // Formatter for input and output (yyyy-MM-dd)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Take date input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = sc.nextLine();

        // Parse the input string to LocalDate
        LocalDate date = LocalDate.parse(inputDate, formatter);

        // Add 7 days, 1 month, and 2 years
        LocalDate addedDate = date.plusDays(7).plusMonths(1).plusYears(2);

        // Subtract 3 weeks
        LocalDate finalDate = addedDate.minusWeeks(3);

        System.out.println("Original Date     : " + date.format(formatter));
        System.out.println("After Adding      : " + addedDate.format(formatter));
        System.out.println("After Subtracting : " + finalDate.format(formatter));

        sc.close();
    }
}
