import java.util.Scanner;

public class NoOfHandshakes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();

       //max handshakakes
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The maximum number of handshakes among "
                + numberOfStudents + " students is " + handshakes);

        scanner.close();
    }
}
