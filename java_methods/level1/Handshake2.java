import java.util.Scanner;

public class Handshake2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("Maximum number of possible handshakes: " + maxHandshakes);

        input.close();
    }
}

