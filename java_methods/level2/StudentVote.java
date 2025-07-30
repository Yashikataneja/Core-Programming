import java.util.Scanner;

public class StudentVote{
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            // Invalid age, cannot vote
            return false;
        }
        // Return true if age is 18 or above, else false
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] studentAges = new int[10];
        for (int i = 0; i < studentAges.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            studentAges[i] = input.nextInt();

            boolean canVote = canStudentVote(studentAges[i]);

            if (canVote) {
                System.out.println("Student " + (i + 1) + " is eligible to vote.");
            } else {
                if (studentAges[i] < 0) {
                    System.out.println("Student " + (i + 1) + " age is invalid, cannot vote.");
                } else {
                    System.out.println("Student " + (i + 1) + " is not eligible to vote.");
                }
            }
        }

        input.close();
    }
}
