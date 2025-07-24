import java.util.Scanner;

public class UniversityFeeDiscount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student fee (INR): ");
        double fee = input.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        double discountAmount = (discountPercent / 100) * fee;
        double finalFee = fee - discountAmount;

        System.out.printf("The discount amount is INR %.2f%n", discountAmount);
        System.out.printf("Final discounted fee is INR %.2f%n", finalFee);

        input.close();
    }
}
