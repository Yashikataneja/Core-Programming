import java.util.Scanner;
public class Handshake {

    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = input.nextInt();
        int handshakes = calculateHandshakes(n);
        System.out.println("Maximum number of handshakes among " + n + " students is: " + handshakes);
        input.close();
    }
}
