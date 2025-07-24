public class DiscountCal {
    public static void main(String[] args) {
        double originalPrice = 125000;
        double discountPercent = 10;

        double discountAmount = (discountPercent / 100) * originalPrice;
        double discountedPrice = originalPrice - discountAmount;

        System.out.println("Discounted amount: INR " + discountAmount);
        System.out.println("Price to pay after discount: INR " + discountedPrice);
    }
}
